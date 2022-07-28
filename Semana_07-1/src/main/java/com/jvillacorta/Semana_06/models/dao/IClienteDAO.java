package com.jvillacorta.Semana_06.models.dao;

import java.util.List;

import com.jvillacorta.Semana_06.models.entity.Cliente;

public interface IClienteDAO {
	
	public List<Cliente> getClientes();
	public void guardar(Cliente cliente);
	public Cliente buscarCliente(Long id);
	public void eliminar(Long id);
}
