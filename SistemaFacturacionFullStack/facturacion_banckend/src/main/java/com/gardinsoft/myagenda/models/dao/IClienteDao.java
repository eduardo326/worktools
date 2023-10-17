package com.gardinsoft.myagenda.models.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gardinsoft.myagenda.models.entity.Cliente;
import com.gardinsoft.myagenda.models.entity.Region;

public interface IClienteDao extends JpaRepository<Cliente, Long>{
	@Query("from Region")
	public List<Region> findAllRegiones();
}
