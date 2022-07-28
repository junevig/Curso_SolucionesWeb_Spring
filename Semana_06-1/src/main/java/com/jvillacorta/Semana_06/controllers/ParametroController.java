package com.jvillacorta.Semana_06.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/parametro")
public class ParametroController {
	
	@RequestMapping("/string")
	public String index(@RequestParam(name = "texto", required=false, defaultValue="valor por defecto") String texto,
			@RequestParam(name = "edad", required=false, defaultValue="18") int edad,
			Model modelo) {
		modelo.addAttribute("resultado", "El texto recibido es:"+texto);
		modelo.addAttribute("resultado2", "El texto recibido es:"+edad);
		//http://localhost:8080/parametro/string?texto=hola
		//http://localhost:8080/parametro/string?texto=hola&edad=19
		return "parametro/ver";
	}
}
