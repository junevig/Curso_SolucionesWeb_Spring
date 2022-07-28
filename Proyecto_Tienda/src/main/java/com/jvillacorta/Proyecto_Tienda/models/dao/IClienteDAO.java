package com.jvillacorta.Proyecto_Tienda.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jvillacorta.Proyecto_Tienda.models.entity.Cliente;

public interface IClienteDAO extends CrudRepository<Cliente, Long>{
	
}
