package com.jvillacorta.Semana_06.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicioController {
	
	@RequestMapping("/")
	public String inicio() {
		return "index";
	}
	
}
