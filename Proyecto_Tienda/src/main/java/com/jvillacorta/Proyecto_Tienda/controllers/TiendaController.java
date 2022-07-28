package com.jvillacorta.Proyecto_Tienda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jvillacorta.Proyecto_Tienda.models.entity.Tienda;
import com.jvillacorta.Proyecto_Tienda.service.ITiendaService;

@Controller
@RequestMapping("/tienda")
public class TiendaController {
	
	@Autowired
	private ITiendaService tiendaService;
	
	@RequestMapping("/lista")
	public String inicio(Model modelo) {
		Tienda tienda = new Tienda();
		modelo.addAttribute("tienda", tienda);
		modelo.addAttribute("listaTiendas", tiendaService.getAllTiendas());
		return "tienda/index";
	}
	
	@RequestMapping(value = "/formulario", method = RequestMethod.POST)
	public String guardar(Tienda tienda) {
		tiendaService.guardar(tienda);
		return "redirect:/tienda/lista";
	}
	
	@RequestMapping(value = "/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		tiendaService.eliminar(id);
		return "redirect:/tienda/lista";
	}
	
}
