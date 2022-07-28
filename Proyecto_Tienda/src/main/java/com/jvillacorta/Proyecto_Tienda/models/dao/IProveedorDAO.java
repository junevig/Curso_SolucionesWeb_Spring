package com.jvillacorta.Proyecto_Tienda.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jvillacorta.Proyecto_Tienda.models.entity.Proveedor;

public interface IProveedorDAO extends CrudRepository<Proveedor, Long> {

}
