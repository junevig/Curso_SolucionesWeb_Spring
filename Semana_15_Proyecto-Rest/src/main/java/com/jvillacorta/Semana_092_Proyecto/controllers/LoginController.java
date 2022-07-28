package com.jvillacorta.Semana_092_Proyecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("/")
	public String inicio(@RequestParam(value = "error", required = false) String error, Model modelo) {
		if(error != null) {
			modelo.addAttribute("error", "Error");
		}
		return "index";
	}
	
}
