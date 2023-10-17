package com.gardinsoft.myagenda.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.gardinsoft.myagenda.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
	
	public Usuario findByUsername(String username);
	
}
