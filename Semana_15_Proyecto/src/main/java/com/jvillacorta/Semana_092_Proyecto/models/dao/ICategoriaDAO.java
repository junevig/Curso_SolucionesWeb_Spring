package com.jvillacorta.Semana_092_Proyecto.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jvillacorta.Semana_092_Proyecto.models.entity.Categoria;

public interface ICategoriaDAO extends CrudRepository<Categoria, Long> {
	
}
