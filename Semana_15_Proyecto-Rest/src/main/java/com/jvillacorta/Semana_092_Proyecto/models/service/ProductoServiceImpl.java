package com.jvillacorta.Semana_092_Proyecto.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvillacorta.Semana_092_Proyecto.models.dao.IProductoDAO;
import com.jvillacorta.Semana_092_Proyecto.models.entity.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductoDAO productoDAO;

	@Override
	public List<Producto> getAllProductos() {
		return productoDAO.findAllByOrderByNombreAsc();
		//return productoDAO.findByNombreLike("Mu"+"%");
	}

	@Override
	public void guardarProducto(Producto producto) {
		productoDAO.save(producto);
	}

}
