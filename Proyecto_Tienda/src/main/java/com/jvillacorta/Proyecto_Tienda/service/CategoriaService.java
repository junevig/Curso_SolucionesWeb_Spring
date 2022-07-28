package com.jvillacorta.Proyecto_Tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvillacorta.Proyecto_Tienda.models.dao.ICategoriaDAO;
import com.jvillacorta.Proyecto_Tienda.models.entity.Categoria;

@Service
public class CategoriaService implements ICategoriaService {
	
	@Autowired
	private ICategoriaDAO categoriaDAO;
	
	@Override
	public List<Categoria> getAllCategorias() {
		List<Categoria> listaCategorias = (List<Categoria>) categoriaDAO.findAll();
		for (Categoria categoria : listaCategorias) {
			if (categoria.getEstado().equals("1")) {
				categoria.setEstado("Activo");
			} else {
				categoria.setEstado("Inactivo");
			}
		}
		return listaCategorias;
	}

	@Override
	public void guardar(Categoria categoria) {
		categoriaDAO.save(categoria);
	}

	@Override
	public void eliminar(Long id) {
		categoriaDAO.deleteById(id);
	}

}
