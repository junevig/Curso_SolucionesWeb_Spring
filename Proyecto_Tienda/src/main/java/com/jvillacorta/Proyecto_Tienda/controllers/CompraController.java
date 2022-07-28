package com.jvillacorta.Proyecto_Tienda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jvillacorta.Proyecto_Tienda.service.IProductoService;
import com.jvillacorta.Proyecto_Tienda.service.IProveedorService;
import com.jvillacorta.Proyecto_Tienda.service.ITiendaService;

@Controller
@RequestMapping("/compras")
public class CompraController {
	
	@Autowired
	private IProveedorService proveedorService;
	
	@Autowired
	private ITiendaService tiendaService;
	
	@Autowired
	private IProductoService productoService;
	
	@RequestMapping("/RegistrarCompra")
	public String registrarCompra(Model modelo) {
		modelo.addAttribute("listaProveedores", proveedorService.getAllProveedores());
		modelo.addAttribute("listaTiendas", tiendaService.getAllTiendas());
		modelo.addAttribute("listaProductos", productoService.getAllProductos());
		return "compras/registrar";
	}
	
	@RequestMapping("/Consultar")
	public String consultas() {
		return "compras/consultar";
	}
	
}
