package com.jvillacorta.Semana_06.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jvillacorta.Semana_06.controllers.models.service.IService;

@Controller
public class InicioController {
	
	@Autowired
	//@Qualifier("MySQL")
	@Qualifier("AWS")
	private IService servicio;
	
	@RequestMapping("/")
	public String index(Model modelo) {
		modelo.addAttribute("resultado", servicio.operacion());
		return "index";
	}
}
