package com.jvillacorta.Proyecto_Tienda.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jvillacorta.Proyecto_Tienda.models.entity.Tienda;

public interface ITiendaDAO extends CrudRepository<Tienda, Long> {

}
