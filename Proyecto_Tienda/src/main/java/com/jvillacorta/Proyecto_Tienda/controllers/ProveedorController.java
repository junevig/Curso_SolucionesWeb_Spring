package com.jvillacorta.Proyecto_Tienda.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jvillacorta.Proyecto_Tienda.models.entity.Proveedor;
import com.jvillacorta.Proyecto_Tienda.service.IProveedorService;

@Controller
@RequestMapping("/proveedor")
public class ProveedorController {
	
	@Autowired
	private IProveedorService proveedorService;
	
	@RequestMapping("/lista")
	public String inicio(Model modelo) {
		Proveedor proveedor = new Proveedor();
		modelo.addAttribute("proveedor", proveedor);
		modelo.addAttribute("listaProveedores", proveedorService.getAllProveedores());
		return "proveedor/index";
	}

	@RequestMapping(value = "/formulario", method = RequestMethod.POST)
	public String guardar(Proveedor proveedor) {
		proveedorService.guardar(proveedor);
		return "redirect:/proveedor/lista";
	}
	
	@RequestMapping(value = "/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id) {
		proveedorService.eliminar(id);
		return "redirect:/proveedor/lista";
	}
}
