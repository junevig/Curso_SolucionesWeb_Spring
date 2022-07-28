package com.jvillacorta.Semana_092_Proyecto.models.service;

import java.util.List;

import com.jvillacorta.Semana_092_Proyecto.models.entity.Producto;

public interface IProductoService {
	
	public List<Producto> getAllProductos();
	public void guardarProducto(Producto producto);
	
}
