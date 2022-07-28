package com.jvillacorta.Proyecto_Tienda.service;

import java.util.List;

import com.jvillacorta.Proyecto_Tienda.models.entity.Tienda;

public interface ITiendaService {

	public List<Tienda> getAllTiendas();
	public void guardar(Tienda tienda);
	public void eliminar(Long id);
	
}
