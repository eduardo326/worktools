package com.gardinsoft.myagenda.models.services;

import com.gardinsoft.myagenda.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}