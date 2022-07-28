package com.jvillacorta.Proyecto_Tienda.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jvillacorta.Proyecto_Tienda.models.entity.Usuario;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long> {
	public Usuario findByUsername(String username);
}
