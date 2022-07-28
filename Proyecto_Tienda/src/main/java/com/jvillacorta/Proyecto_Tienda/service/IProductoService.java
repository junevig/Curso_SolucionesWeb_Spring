package com.jvillacorta.Proyecto_Tienda.service;

import java.util.List;

import com.jvillacorta.Proyecto_Tienda.models.entity.Producto;

public interface IProductoService {
	public List<Producto> getAllProductos();
	public void guardar(Producto producto);
	public void eliminar(Long id);
	public int cantidadFilas();
	public String codigoFormato(int numero);
}
