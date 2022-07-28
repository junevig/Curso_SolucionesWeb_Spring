package com.jvillacorta.Semana_08T2.models.dao;

import java.util.List;

import com.jvillacorta.Semana_08T2.models.entity.Producto;

public interface IProductoDAO {
	public List<Producto> getProductos();
	public void guardar(Producto producto);
	public Producto buscarProducto(Long codigo);
	public void eliminar(Long codigo);
}
