package com.jvillacorta.Proyecto_Tienda.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jvillacorta.Proyecto_Tienda.models.entity.Producto;

public interface IProductoDAO extends CrudRepository<Producto, Long>{
	public Producto findFirstByOrderByCodigoDesc();
}
