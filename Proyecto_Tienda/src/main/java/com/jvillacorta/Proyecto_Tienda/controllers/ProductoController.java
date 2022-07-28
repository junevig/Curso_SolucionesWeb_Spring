package com.jvillacorta.Proyecto_Tienda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jvillacorta.Proyecto_Tienda.models.entity.Producto;
import com.jvillacorta.Proyecto_Tienda.service.ICategoriaService;
import com.jvillacorta.Proyecto_Tienda.service.IProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	private IProductoService productoService;
	
	@Autowired
	private ICategoriaService categoriaService;
	
	@RequestMapping("/lista")
	public String inicio(Model modelo) {
		Producto producto = new Producto();
		modelo.addAttribute("producto", producto);
		modelo.addAttribute("listaProductos", productoService.getAllProductos());
		modelo.addAttribute("listaCategorias", categoriaService.getAllCategorias());
		int codigo = productoService.cantidadFilas()+1;
		modelo.addAttribute("nuevoCodigo", productoService.codigoFormato(codigo));
		modelo.addAttribute("nuevoVCodigo", codigo);
		//System.out.println(codigo);
		//System.out.println(productoService.codigoFormato(codigo));
		return "producto/index";
	}
	
	@RequestMapping(value = "/formulario", method = RequestMethod.POST)
	public String guardar(Producto producto) {
		productoService.guardar(producto);
		return "redirect:/producto/lista";
	}
	
	@RequestMapping(value = "/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id")Long id) {
		productoService.eliminar(id);
		return "redirect:/producto/lista";
	}
	
}
