package com.jvillacorta.Proyecto_Tienda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jvillacorta.Proyecto_Tienda.models.entity.Categoria;
import com.jvillacorta.Proyecto_Tienda.service.ICategoriaService;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private ICategoriaService categoriaService;
	
	@RequestMapping("/lista")
	public String inicio(Model modelo) {
		Categoria categoria = new Categoria();
		modelo.addAttribute("categoria", categoria);
		modelo.addAttribute("listaCategorias", categoriaService.getAllCategorias());
		return "categoria/index";
	}
	
	@RequestMapping(value = "/formulario", method = RequestMethod.POST)
	public String guardar(Categoria categoria) {
		categoriaService.guardar(categoria);
		return "redirect:/categoria/lista";
	}
	
	@RequestMapping(value = "/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		categoriaService.eliminar(id);
		return "redirect:/categoria/lista";
	}
	
}
