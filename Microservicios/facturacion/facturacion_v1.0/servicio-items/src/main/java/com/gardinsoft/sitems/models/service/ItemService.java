package com.gardinsoft.sitems.models.service;

import java.util.List;

import com.gardinsoft.sitems.models.Item;
import com.gardinsoft.scommons.models.entity.Producto;

public interface ItemService {
	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
	
	public Producto save(Producto producto);
	
	public Producto update(Producto producto, Long id);
	
	public void delete(Long id);
}
