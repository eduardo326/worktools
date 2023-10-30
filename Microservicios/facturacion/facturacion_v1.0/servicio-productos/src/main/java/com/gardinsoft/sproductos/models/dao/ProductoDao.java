package com.gardinsoft.sproductos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.gardinsoft.scommons.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
