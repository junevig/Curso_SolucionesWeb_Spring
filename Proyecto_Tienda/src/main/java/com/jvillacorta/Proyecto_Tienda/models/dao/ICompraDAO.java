package com.jvillacorta.Proyecto_Tienda.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jvillacorta.Proyecto_Tienda.models.entity.Compra;

public interface ICompraDAO extends CrudRepository<Compra, Long> {

}
