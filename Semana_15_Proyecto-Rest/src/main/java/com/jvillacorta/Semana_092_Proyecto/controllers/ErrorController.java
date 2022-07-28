package com.jvillacorta.Semana_092_Proyecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorController {

	@RequestMapping("/403")
	public String inicio() {
		return "errores/403";
	}
	
}
