package com.jvillacorta.Semana_06.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jvillacorta.Semana_06.models.dao.IProductoDAO;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private IProductoDAO productoDAO;
	
	@RequestMapping("/listar")
	public String listar(Model modelo) {
		modelo.addAttribute("listaProductos", productoDAO.getProductos());
		return "productos/listar";
	}
	
}
