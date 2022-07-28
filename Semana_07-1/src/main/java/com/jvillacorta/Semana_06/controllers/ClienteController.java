package com.jvillacorta.Semana_06.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jvillacorta.Semana_06.models.dao.IClienteDAO;
import com.jvillacorta.Semana_06.models.entity.Cliente;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private IClienteDAO clienteDAO;
	
	@RequestMapping("/listar")
	public String listar(Model modelo) {
		modelo.addAttribute("listaClientes", clienteDAO.getClientes());
		return "clientes/listar";
	}
	
	@RequestMapping("/formulario")
	public String crear(Model modelo) {
		Cliente cliente = new Cliente();
		modelo.addAttribute("cliente", cliente);
		return "clientes/formulario";
	}
	
	@RequestMapping(value = "/formulario", method = RequestMethod.POST)
	public String guardar(Cliente cliente) {
		clienteDAO.guardar(cliente);
		return "redirect:/clientes/listar";
	}
	
	@RequestMapping("/formulario/editar/{id}")
	public String editar(@PathVariable(value = "id") Long id, Model modelo) {
		Cliente cliente = clienteDAO.buscarCliente(id);
		modelo.addAttribute("cliente", cliente);
		return "clientes/formulario";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		clienteDAO.eliminar(id);
		return "redirect:/clientes/listar";
	}
	
}
