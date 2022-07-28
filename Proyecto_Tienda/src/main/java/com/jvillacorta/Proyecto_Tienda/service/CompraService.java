package com.jvillacorta.Proyecto_Tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvillacorta.Proyecto_Tienda.models.dao.ICompraDAO;
import com.jvillacorta.Proyecto_Tienda.models.entity.Compra;

@Service
public class CompraService implements ICompraService {
	
	@Autowired
	private ICompraDAO compraDAO;
	
	@Override
	public List<Compra> getAllCompras() {
		List<Compra> listaCompras = (List<Compra>) compraDAO.findAll();
		/*for (ProductoTienda productoTienda : listaProductosTienda) {
			if (productoTienda.getEstado().equals("1")) {
				productoTienda.setEstado("Activo");
			} else {
				productoTienda.setEstado("Inactivo");
			}
		}*/
		return listaCompras;
	}

	@Override
	public void guardar(Compra compra) {
		compraDAO.save(compra);
	}

	@Override
	public void eliminar(Long id) {
		compraDAO.deleteById(id);
	}
 
}
