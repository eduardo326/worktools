package com.gardinsoft.myagenda.models.services;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UploadFileServiceImpl implements IUploadFileService{
	
	private final Logger log = LoggerFactory.getLogger(UploadFileServiceImpl.class);
	
	private final static String DIRECTORIO_UPLOAD = "uploads";

	@Override
	public Resource cargar(String nombreFoto) throws MalformedURLException {
		// TODO Auto-generated method stub
		Path rutaArchivo = this.getPath(nombreFoto);
		log.info(rutaArchivo.toString());
		
		Resource recurso = new UrlResource(rutaArchivo.toUri());

		if(!recurso.exists() && !recurso.isReadable()) {
			rutaArchivo = Paths.get("src/main/resources/static/img").resolve("notuser.png").toAbsolutePath();
			recurso = new UrlResource(rutaArchivo.toUri());
			log.error("Error no se pudo cargar la imagen: " + nombreFoto);
		}
		return recurso;
	}

	@Override
	public String copiar(MultipartFile archivo) throws IOException {
		// TODO Auto-generated method stub
		String nombreArchivo = UUID.randomUUID().toString()+"_"+ archivo.getOriginalFilename().replace(" ", "");
		Path rutaArchivo = this.getPath(nombreArchivo);
		

		Files.copy(archivo.getInputStream(), rutaArchivo);

		return nombreArchivo;
	}

	@Override
	public boolean eliminar(String nombreFoto) {
		// TODO Auto-generated method stub
		if(nombreFoto != null && nombreFoto.length() > 0) {
			Path rutaFotoAnterior = Paths.get("uploads").resolve(nombreFoto).toAbsolutePath();
			File archivoFotoAnterior = rutaFotoAnterior.toFile();
			if(archivoFotoAnterior.exists() && archivoFotoAnterior.canRead()) {
				archivoFotoAnterior.delete();
				return true;
			}
		}
		return false;
	}

	@Override
	public Path getPath(String nombreFoto) {
		// TODO Auto-generated method stub

		return Paths.get(DIRECTORIO_UPLOAD).resolve(nombreFoto).toAbsolutePath();
	}

}
