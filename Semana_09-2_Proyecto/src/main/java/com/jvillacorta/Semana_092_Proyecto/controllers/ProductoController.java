package com.jvillacorta.Semana_092_Proyecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/producto")
public class ProductoController {

	@RequestMapping("/")
	public String inicio() {
		return "producto/index";
	}
}
