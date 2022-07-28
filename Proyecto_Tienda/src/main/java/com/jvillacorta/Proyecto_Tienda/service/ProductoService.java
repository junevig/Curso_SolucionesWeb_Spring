package com.jvillacorta.Proyecto_Tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvillacorta.Proyecto_Tienda.models.dao.IProductoDAO;
import com.jvillacorta.Proyecto_Tienda.models.entity.Producto;

@Service
public class ProductoService implements IProductoService {
	
	@Autowired
	private IProductoDAO productoDAO;
	
	@Override
	public List<Producto> getAllProductos() {
		List<Producto> listaProductos = (List<Producto>) productoDAO.findAll();
		for (Producto producto : listaProductos) {
			if (producto.getEstado().equals("1")) {
				producto.setEstado("Activo");
			} else {
				producto.setEstado("Inactivo");
			}
		}
		return listaProductos;
	}

	@Override
	public void guardar(Producto producto) {
		// codigo nuevo con el formato
		producto.setCodigo(codigoFormato(cantidadFilas()+1));
		// codigo nuevo
		producto.setValorCodigo(cantidadFilas()+1);
		productoDAO.save(producto);
	}

	@Override
	public void eliminar(Long id) {
		productoDAO.deleteById(id);
	}

	@Override
	public int cantidadFilas() {
		Producto producto = productoDAO.findFirstByOrderByCodigoDesc();
		if(producto == null) {
			return 1;
		}
		return Integer.parseInt(producto.getCodigo().toString());
	}

	@Override
	public String codigoFormato(int numero) {
		return String.format("%06d", numero);
	}

}
