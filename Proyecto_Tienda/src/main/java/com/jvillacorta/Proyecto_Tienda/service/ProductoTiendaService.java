package com.jvillacorta.Proyecto_Tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvillacorta.Proyecto_Tienda.models.dao.IProductoTiendaDAO;
import com.jvillacorta.Proyecto_Tienda.models.entity.ProductoTienda;

@Service
public class ProductoTiendaService implements IProductoTiendaService {
	
	@Autowired
	private IProductoTiendaDAO productoTiendaDAO;
	
	@Override
	public List<ProductoTienda> getAllProductosTienda() {
		List<ProductoTienda> listaProductosTienda = (List<ProductoTienda>) productoTiendaDAO.findAll();
		/*for (ProductoTienda productoTienda : listaProductosTienda) {
			if (productoTienda.getEstado().equals("1")) {
				productoTienda.setEstado("Activo");
			} else {
				productoTienda.setEstado("Inactivo");
			}
		}*/
		return listaProductosTienda;
	}

	@Override
	public void guardar(ProductoTienda productoTienda) {
		productoTiendaDAO.save(productoTienda);
	}

	@Override
	public void eliminar(Long id) {
		productoTiendaDAO.deleteById(id);
	}

}
