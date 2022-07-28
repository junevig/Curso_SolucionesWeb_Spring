package com.jvillacorta.Semana_092_Proyecto.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jvillacorta.Semana_092_Proyecto.models.entity.Categoria;
import com.jvillacorta.Semana_092_Proyecto.models.service.ICategoriaService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:8080"})
public class CategoriaRestController {
	//https://www.youtube.com/watch?v=RABN1tDBN4Q
	
	@Autowired
	private ICategoriaService categoriaService;
	
	//http://localhost:8080/api
	@GetMapping
	public List<Categoria> listar(){
		return categoriaService.getAllCategorias();
	}
	
	//
	@PostMapping
	public void insertar(@RequestBody Categoria categoria) {
		categoriaService.guardar(categoria);
	}
	
	//
	@PutMapping
	public void modificar(@RequestBody Categoria categoria) {
		categoriaService.guardar(categoria);
	}
	
	//
	@DeleteMapping(value = "/{id}")
	public void eliminar(Long id) {
		categoriaService.eliminarCategoria(id);
	}
	
}
