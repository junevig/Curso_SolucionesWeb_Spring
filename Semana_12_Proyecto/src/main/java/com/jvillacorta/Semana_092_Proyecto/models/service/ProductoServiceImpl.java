package com.jvillacorta.Semana_092_Proyecto.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvillacorta.Semana_092_Proyecto.models.dao.IProductoDAO;
import com.jvillacorta.Semana_092_Proyecto.models.entity.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private IProductoDAO productoDAO;
	
	@Override
	public void guardarProducto(Producto producto) {
		productoDAO.save(producto);
	}

}
