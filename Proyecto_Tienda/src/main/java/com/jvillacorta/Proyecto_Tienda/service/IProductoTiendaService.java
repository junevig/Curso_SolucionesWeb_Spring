package com.jvillacorta.Proyecto_Tienda.service;

import java.util.List;

import com.jvillacorta.Proyecto_Tienda.models.entity.ProductoTienda;

public interface IProductoTiendaService {
	public List<ProductoTienda> getAllProductosTienda();
	public void guardar(ProductoTienda productoTienda);
	public void eliminar(Long id);
}
