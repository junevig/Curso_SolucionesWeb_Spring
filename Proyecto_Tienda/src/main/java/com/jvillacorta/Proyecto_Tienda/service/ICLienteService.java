package com.jvillacorta.Proyecto_Tienda.service;

import java.util.List;

import com.jvillacorta.Proyecto_Tienda.models.entity.Cliente;

public interface ICLienteService {
	
	public List<Cliente> getAllClientes();
	public void guardar(Cliente cliente);
	public void eliminar(Long id);
	
}
