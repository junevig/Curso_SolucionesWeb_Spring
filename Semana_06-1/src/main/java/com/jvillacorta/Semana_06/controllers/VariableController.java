package com.jvillacorta.Semana_06.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class VariableController {
	
	@RequestMapping("/string/{texto}/{edad}")
	public String variables(@PathVariable String texto,
			@PathVariable int edad,
			Model modelo) {
		modelo.addAttribute("resultado", "El texto recibido es: "+texto+" y la edad es: "+edad);
		return "variables/ver";
	}
}
