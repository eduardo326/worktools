package com.gardinsoft.soauth.services;

import com.gardinsoft.scommons.models.usuarios.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);

}