package com.jvillacorta.Proyecto_Tienda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.jvillacorta.Proyecto_Tienda.models.entity.ProductoTienda;
import com.jvillacorta.Proyecto_Tienda.service.IProductoService;
import com.jvillacorta.Proyecto_Tienda.service.IProductoTiendaService;
import com.jvillacorta.Proyecto_Tienda.service.ITiendaService;

@Controller
@RequestMapping("/producto_tienda")
public class ProductoTiendaController {
	
	@Autowired
	private IProductoTiendaService productoTiendaService;
	
	@Autowired
	private ITiendaService tiendaService;
	
	@Autowired
	private IProductoService productoService;
	
	@RequestMapping("/lista")
	public String inicio(Model modelo) {
		ProductoTienda productoTienda = new ProductoTienda();
		modelo.addAttribute("productoTienda", productoTienda);
		
		modelo.addAttribute("listaTiendas", tiendaService.getAllTiendas());
		System.out.println(tiendaService.getAllTiendas());
		modelo.addAttribute("listaProductos", productoService.getAllProductos());
		modelo.addAttribute("listaProductosTienda", productoTiendaService.getAllProductosTienda());
/*
		modelo.addAttribute("producto", new Producto());
		modelo.addAttribute("tienda", new Tienda());*/
		return "producto_tienda/index";
	}
	
	@RequestMapping(value = "/formulario", method = RequestMethod.POST)
	public String guardar(ProductoTienda productoTienda) {
		productoTiendaService.guardar(productoTienda);
		return "redirect:/producto_tienda/lista";
	}
	
	@RequestMapping(value = "/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		productoTiendaService.eliminar(id);
		return "redirect:/producto_tienda/lista";
	}
	
}
