package com.jvillacorta.Semana_092_Proyecto.models.service;

import java.util.List;

import com.jvillacorta.Semana_092_Proyecto.models.entity.Categoria;

public interface ICategoriaService {
	
	public void guardar(Categoria categoria);
	public List<Categoria> getAllCategorias();
}
