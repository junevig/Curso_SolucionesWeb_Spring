package com.jvillacorta.Semana_092_Proyecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jvillacorta.Semana_092_Proyecto.models.entity.Producto;
import com.jvillacorta.Semana_092_Proyecto.models.service.ICategoriaService;
import com.jvillacorta.Semana_092_Proyecto.models.service.IProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {
	

	@Autowired
	private ICategoriaService categoriaService;
	
	@Autowired
	private IProductoService productoService;
	
	@RequestMapping("/")
	public String inicio(Model modelo) {
		Producto producto = new Producto();
		modelo.addAttribute("producto", producto);
		modelo.addAttribute("listaCategorias", categoriaService.getAllCategorias());
		return "producto/index";
	}
}
