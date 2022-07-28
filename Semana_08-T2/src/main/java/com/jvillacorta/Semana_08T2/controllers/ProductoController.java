package com.jvillacorta.Semana_08T2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jvillacorta.Semana_08T2.models.dao.IProductoDAO;
import com.jvillacorta.Semana_08T2.models.entity.Producto;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	private IProductoDAO productoDAO;
	
	@RequestMapping("/lista")
	public String lista(Model modelo) {
		modelo.addAttribute("listaProductos", productoDAO.getProductos());
		return "productos/lista";
	}
	
	@RequestMapping("/formulario/nuevo")
	public String formulario(Model modelo) {
		Producto producto = new Producto();
		modelo.addAttribute("producto", producto);
		return "productos/formulario";
	}
	
	@RequestMapping(value = "/formulario/nuevo", method = RequestMethod.POST)
	public String guardar(Producto producto) {
		productoDAO.guardar(producto);
		return "redirect:/productos/lista";
	}
	
	@RequestMapping("/formulario/editar/{codigo}")
	public String editar(@PathVariable(value = "codigo") Long codigo, Model modelo) {
		Producto producto = productoDAO.buscarProducto(codigo);
		modelo.addAttribute("producto", producto);
		return "productos/formulario";
	}
	
	@RequestMapping("/eliminar/{codigo}")
	public String eliminar(@PathVariable(value = "codigo") Long codigo) {
		productoDAO.eliminar(codigo);
		return "redirect:/productos/lista";
	}
}
