package com.jvillacorta.Semana_06.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.jvillacorta.Semana_06.models.entity.Producto;

@Repository
public class ProductoDAO implements IProductoDAO{
	
	@PersistenceContext
	EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> getProductos() {
		return em.createQuery("from Producto").getResultList();
	}

}
