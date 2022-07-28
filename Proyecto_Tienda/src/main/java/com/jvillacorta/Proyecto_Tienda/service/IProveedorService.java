package com.jvillacorta.Proyecto_Tienda.service;

import java.util.List;

import com.jvillacorta.Proyecto_Tienda.models.entity.Proveedor;

public interface IProveedorService {

	public List<Proveedor> getAllProveedores();
	public void guardar(Proveedor proveedor);
	public void eliminar(Long id);
	
}
