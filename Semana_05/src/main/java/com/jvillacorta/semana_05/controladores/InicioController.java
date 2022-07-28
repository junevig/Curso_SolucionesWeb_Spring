package com.jvillacorta.semana_05.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InicioController {
	
	@RequestMapping({"/", "inicio"})
	public String inicio() {
		return "index";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "administrador";
	}
}
