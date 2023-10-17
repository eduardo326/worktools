package com.gardinsoft.chat.models.services;

import java.util.List;

import com.gardinsoft.chat.models.documents.Mensaje;

public interface ChatService {
	public List<Mensaje> obtenerUltimos10Mensajes();
	public Mensaje guardar(Mensaje mensaje);
}
