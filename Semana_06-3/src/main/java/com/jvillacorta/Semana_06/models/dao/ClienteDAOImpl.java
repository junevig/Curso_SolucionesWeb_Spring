package com.jvillacorta.Semana_06.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.jvillacorta.Semana_06.models.entity.Cliente;

@Repository
public class ClienteDAOImpl implements IClienteDAO{
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> getClientes() {
		return em.createQuery("from Cliente").getResultList();
	}

}
