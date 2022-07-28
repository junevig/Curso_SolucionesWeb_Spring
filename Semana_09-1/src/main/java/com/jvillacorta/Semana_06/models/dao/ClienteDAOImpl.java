package com.jvillacorta.Semana_06.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jvillacorta.Semana_06.models.entity.Cliente;

@Repository
public class ClienteDAOImpl implements IClienteDAO{
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> getClientes() {
		//     nombre de la entidad en java
		return em.createQuery("from Cliente").getResultList();
	}

	@Override
	@Transactional
	public void guardar(Cliente cliente) {
		if (cliente.getId() != null) {
			//actualizar
			em.merge(cliente);
		} else {
			em.persist(cliente);
		}
	}

	@Override
	public Cliente buscarCliente(Long id) {
		return em.find(Cliente.class, id);
	}

	@Override
	@Transactional
	public void eliminar(Long id) {
		Cliente cliente = buscarCliente(id);
		em.remove(cliente);
	}

}
