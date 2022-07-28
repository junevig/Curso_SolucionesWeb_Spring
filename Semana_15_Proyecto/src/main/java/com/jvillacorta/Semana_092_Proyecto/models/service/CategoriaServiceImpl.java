package com.jvillacorta.Semana_092_Proyecto.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvillacorta.Semana_092_Proyecto.models.dao.ICategoriaDAO;
import com.jvillacorta.Semana_092_Proyecto.models.entity.Categoria;

@Service
public class CategoriaServiceImpl implements ICategoriaService{
	
	@Autowired
	private ICategoriaDAO categoriaDAO;
	
	@Override
	public void guardar(Categoria categoria) {
		categoriaDAO.save(categoria);
	}

	@Override
	public List<Categoria> getAllCategorias() {
		return (List<Categoria>) categoriaDAO.findAll();
	}

	@Override
	public void eliminarCategoria(Long id) {
		categoriaDAO.deleteById(id);
	}

}
