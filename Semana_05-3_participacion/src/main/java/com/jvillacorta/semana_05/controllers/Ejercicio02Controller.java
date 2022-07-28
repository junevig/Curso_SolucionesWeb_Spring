package com.jvillacorta.semana_05.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jvillacorta.semana_05.models.Categoria;
import com.jvillacorta.semana_05.models.Producto;

@Controller
@RequestMapping("/ejercicio02")
public class Ejercicio02Controller {
	
	//Categoría
	@RequestMapping("/categoria")
	public String indexCategoria() {
		return "ejercicio02/categoria/index";
	}
	
	@RequestMapping("/categoria/listar")
	public String listarCategoria(Model modelo) {
		List<Categoria> listaCategorias = new ArrayList<>();
		listaCategorias.add(new Categoria((long) 10001, "Carnes"));
		listaCategorias.add(new Categoria((long) 10002, "Lacteos"));
		listaCategorias.add(new Categoria((long) 10003, "Frutas"));
		modelo.addAttribute("categorias", listaCategorias);
		return "ejercicio02/categoria/listar";
	}
	
	//Producto
	@RequestMapping("/producto")
	public String indexProducto() {
		return "ejercicio02/producto/index";
	}
	
	@RequestMapping("/producto/listar")
	public String listarProducto(Model modelo) {
		List<Producto> listaProductos = new ArrayList<>();
		listaProductos.add(new Producto((long) 10001, "Carne de res", 15.00));
		listaProductos.add(new Producto((long) 10002, "Tarro de leche", 4.00));
		listaProductos.add(new Producto((long) 10003, "Manzana", 1.00));
		modelo.addAttribute("productos", listaProductos);
		return "ejercicio02/producto/listar";
	}
}
