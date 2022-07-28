package com.jvillacorta.semana_05.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ejercicio01")
public class Ejercicio01Controller {
	
	@RequestMapping("/")
	public String index() {
		return "ejercicio01/index";
	}
	
	@RequestMapping("/configuracion")
	public String configuracion(Model model) {
		model.addAttribute("resultado", "Parámetro recibido desde el controlador usando Model.");
		return "ejercicio01/configuracion";
	}
	
	@RequestMapping("/transferencias")
	public String transferencias(ModelMap modeloMap) {
		modeloMap.addAttribute("resultado", "Parámetro recibido desde el controlador usando ModelMap.");
		return "ejercicio01/transferencias";
	}

	@RequestMapping("/pagos")
	public String pagos(Map<String, Object> map) {
		map.put("resultado", "Parámetro recibido desde el controlador usando Map.");
		return "ejercicio01/pagos";
	}
	
	@RequestMapping("/reportes")
	public ModelAndView reportes(ModelAndView mav) {
		mav.addObject("resultado", "Parámetro recibido desde el controlador usando ModelAndView.");
		mav.setViewName("ejercicio01/reportes");
		return mav;
	}
}
