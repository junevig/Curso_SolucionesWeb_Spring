package com.jvillacorta.Semana_092_Proyecto.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jvillacorta.Semana_092_Proyecto.models.entity.Producto;

public interface IProductoDAO extends CrudRepository<Producto, Long>{
	public List<Producto> findAllByOrderByNombreAsc();
	public List<Producto> findByNombreLike(String Nombre);
}
