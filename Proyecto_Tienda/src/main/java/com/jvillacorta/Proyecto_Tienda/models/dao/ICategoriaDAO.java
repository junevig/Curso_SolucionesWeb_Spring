package com.jvillacorta.Proyecto_Tienda.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jvillacorta.Proyecto_Tienda.models.entity.Categoria;

public interface ICategoriaDAO extends CrudRepository<Categoria, Long> {

}
