package com.jvillacorta.Proyecto_Tienda.service;

import java.util.List;

import com.jvillacorta.Proyecto_Tienda.models.entity.Compra;

public interface ICompraService {

	public List<Compra> getAllCompras();
	public void guardar(Compra compra);
	public void eliminar(Long id);
	
}
