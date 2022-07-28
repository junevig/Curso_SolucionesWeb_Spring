package com.jvillacorta.Proyecto_Tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvillacorta.Proyecto_Tienda.models.dao.ITiendaDAO;
import com.jvillacorta.Proyecto_Tienda.models.entity.Tienda;

@Service
public class TiendaService implements ITiendaService {
	
	@Autowired
	private ITiendaDAO tiendaDAO;
	
	@Override
	public List<Tienda> getAllTiendas() {
		List<Tienda> listaTiendas = (List<Tienda>) tiendaDAO.findAll();
		for (Tienda producto : listaTiendas) {
			if (producto.getEstado().equals("1")) {
				producto.setEstado("Activo");
			} else {
				producto.setEstado("Inactivo");
			}
		}
		return listaTiendas;
	}

	@Override
	public void guardar(Tienda tienda) {
		tiendaDAO.save(tienda);
	}

	@Override
	public void eliminar(Long id) {
		tiendaDAO.deleteById(id);
	}

}
