package com.jvillacorta.Semana_06.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jvillacorta.Semana_06.models.dao.IClienteDAO;

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
	
}
