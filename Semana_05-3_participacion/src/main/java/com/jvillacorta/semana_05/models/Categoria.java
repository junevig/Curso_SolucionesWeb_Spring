package com.jvillacorta.semana_05.models;

public class Categoria {
	private Long codigo;
	private String nombre;
	public Categoria(Long codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
