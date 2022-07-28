package com.jvillacorta.Semana_092_Proyecto.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/principal")
public class PrincipalController {
	
	@RequestMapping("/")
	public String inicio(@AuthenticationPrincipal User usuario) {
		System.out.println(usuario);
		return "principal/index";
	}
}
