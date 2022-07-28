package com.jvillacorta.Semana_08T2.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.jvillacorta.Semana_08T2.models.entity.Producto;

@Repository
public class ProductoDAO implements IProductoDAO{
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Producto> getProductos() {
		return em.createQuery("from Producto").getResultList();
	}

	@Override
	@Transactional
	public void guardar(Producto producto) {
		if(producto.getCodigo() == null) {
			em.persist(producto);
		} else {
			em.merge(producto);
		}
	}

	@Override
	public Producto buscarProducto(Long codigo) {
		return em.find(Producto.class, codigo);
	}

	@Override
	@Transactional
	public void eliminar(Long codigo) {
		Producto producto = buscarProducto(codigo);
		em.remove(producto);
	}

}
