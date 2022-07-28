package com.jvillacorta.Proyecto_Tienda.controllers;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
	
	@RequestMapping("/")
	public String inicio(Model modelo, Principal principal, RedirectAttributes flash,
			@RequestParam(value = "error", required = false) String error) {
		if (error != null) {
			modelo.addAttribute("error", "Usuario y/o contraseña incorrecta");
		}
		
		if (principal != null) {
			flash.addFlashAttribute("info", "Ya ha iniciado sesión");
			return "redirect:/principal/";
		}
		return "index";
	}
	
}
