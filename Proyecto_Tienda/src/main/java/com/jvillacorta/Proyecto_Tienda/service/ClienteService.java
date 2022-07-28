package com.jvillacorta.Proyecto_Tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jvillacorta.Proyecto_Tienda.models.dao.IClienteDAO;
import com.jvillacorta.Proyecto_Tienda.models.entity.Cliente;

@Service
public class ClienteService implements ICLienteService {
	
	@Autowired
	private IClienteDAO clienteDAO;

	@Override
	public List<Cliente> getAllClientes() {
		List<Cliente> listaClientes = (List<Cliente>) clienteDAO.findAll();
		for (Cliente cliente : listaClientes) {
			if (cliente.getEstado().equals("1")) {
				cliente.setEstado("Activo");
			} else {
				cliente.setEstado("Inactivo");
			}
		}
		return listaClientes;
	}

	@Override
	public void guardar(Cliente cliente) {
		clienteDAO.save(cliente);
	}
	
	@Override
	public void eliminar(Long id) {
		clienteDAO.deleteById(id);
	}
	
}
