package com.jvillacorta.Proyecto_Tienda.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jvillacorta.Proyecto_Tienda.models.entity.ProductoTienda;

public interface IProductoTiendaDAO extends CrudRepository<ProductoTienda, Long>{
	
}
