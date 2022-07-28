package com.jvillacorta.semana_05.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jvillacorta.semana_05.models.Usuario;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@RequestMapping("/perfil")
	public String inicio(Model model) {
		Usuario usuario = new Usuario("Julio", "Villacorta", "n00160528@upn.pe");
		model.addAttribute("usuario", usuario);
		return "usuario/perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		List<Usuario> listaUsuarios = new ArrayList<>();
		listaUsuarios.add(new Usuario("Julio", "Villacorta", "j@correo.com"));
		listaUsuarios.add(new Usuario("Diego", "Villacorta", "d@correo.com"));
		listaUsuarios.add(new Usuario("Alvaro", "Villacorta", "a@correo.com"));
		model.addAttribute("usuarios", listaUsuarios);
		return "usuario/listar";
	}
}
