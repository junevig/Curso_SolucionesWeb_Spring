package com.jvillacorta.semana_05.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/inicio")
public class InicioController {
	/*
	@RequestMapping("/")
	public String inicio(Model model) {
		String texto = "Hola desde el controlador usando Model";
		model.addAttribute("t", texto);
		return "inicio/index";
	}
	*/
	/*
	@RequestMapping("/")
	public String inicio(ModelMap model) {
		String texto = "Hola desde el controlador usando ModelMap";
		model.addAttribute("t", texto);
		return "inicio/index";
	}
	*/
	/*
	@RequestMapping("/")
	public String inicio(Map<String, Object> map) {
		String texto = "Hola desde el controlador usando Map";
		map.put("t", texto);
		return "inicio/index";
	}
	*/
	
	@RequestMapping("/")
	public ModelAndView inicio(ModelAndView mv) {
		String texto = "Hola desde el controlador usando ModelAndView";
		mv.addObject("t", texto);
		mv.setViewName("inicio/index");
		return mv;
	}
	
}
