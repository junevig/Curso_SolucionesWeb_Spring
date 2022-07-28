package com.jvillacorta.Proyecto_Tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvillacorta.Proyecto_Tienda.models.dao.IProveedorDAO;
import com.jvillacorta.Proyecto_Tienda.models.entity.Proveedor;

@Service
public class ProveedorService implements IProveedorService {
	
	@Autowired
	private IProveedorDAO proveedorDAO;

	@Override
	public List<Proveedor> getAllProveedores() {
		List<Proveedor> listaProveedores = (List<Proveedor>) proveedorDAO.findAll();
		for (Proveedor proveedor : listaProveedores) {
			if (proveedor.getEstado().equals("1")) {
				proveedor.setEstado("Activo");
			} else {
				proveedor.setEstado("Inactivo");
			}
		}
		return listaProveedores;
	}

	@Override
	public void guardar(Proveedor proveedor) {
		proveedorDAO.save(proveedor);
	}

	@Override
	public void eliminar(Long id) {
		proveedorDAO.deleteById(id);
	}
	
}
