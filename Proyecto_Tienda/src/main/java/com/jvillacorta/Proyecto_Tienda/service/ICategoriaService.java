package com.jvillacorta.Proyecto_Tienda.service;

import java.util.List;

import com.jvillacorta.Proyecto_Tienda.models.entity.Categoria;

public interface ICategoriaService {
	public List<Categoria> getAllCategorias();
	public void guardar(Categoria categoria);
	public void eliminar(Long id);
}
