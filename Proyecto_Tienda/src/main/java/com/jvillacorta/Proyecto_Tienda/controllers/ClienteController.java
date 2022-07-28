package com.jvillacorta.Proyecto_Tienda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jvillacorta.Proyecto_Tienda.models.entity.Cliente;
import com.jvillacorta.Proyecto_Tienda.service.ICLienteService;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ICLienteService clienteService;
	
	@RequestMapping("/lista")
	public String inicio(Model modelo) {
		Cliente cliente = new Cliente();
		modelo.addAttribute("cliente", cliente);
		modelo.addAttribute("listaClientes", clienteService.getAllClientes());
		return "cliente/index";
	}
	
	@RequestMapping(value = "/formulario", method = RequestMethod.POST)
	public String guardar(Cliente cliente) {
		clienteService.guardar(cliente);
		return "redirect:/cliente/lista";
	}
	
	@RequestMapping(value = "/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		clienteService.eliminar(id);
		return "redirect:/cliente/lista";
	}
}
