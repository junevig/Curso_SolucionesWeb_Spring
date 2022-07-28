package com.jvillacorta.Semana_092_Proyecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("categoria")
public class CategoriaController {

	@RequestMapping("/")
	public String inicio() {
		return "categoria/index";
	}
	
}
