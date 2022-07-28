package com.jvillacorta.semana_05.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mantenimiento")
public class MantenimientoController {
	
	@RequestMapping({"/", "/inicio"})
	public String inicio() {
		return "mantenimiento/inicio";
	}
}
