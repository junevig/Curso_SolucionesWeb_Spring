package com.jvillacorta.Semana_092_Proyecto.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jvillacorta.Semana_092_Proyecto.models.entity.Usuario;

public interface IUsuarioDAO extends CrudRepository<Usuario, Long>{
	public Usuario findByUsername(String username);
}
