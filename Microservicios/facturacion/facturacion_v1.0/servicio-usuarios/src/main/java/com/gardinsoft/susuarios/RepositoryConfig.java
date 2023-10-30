package com.gardinsoft.susuarios;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.gardinsoft.scommons.models.usuarios.Rol;
import com.gardinsoft.scommons.models.usuarios.Usuario;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer{
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Usuario.class, Rol.class);
	}
}
	
