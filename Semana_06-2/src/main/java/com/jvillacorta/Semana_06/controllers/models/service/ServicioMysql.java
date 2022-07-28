package com.jvillacorta.Semana_06.controllers.models.service;

import org.springframework.stereotype.Service;

@Service("MySQL")
public class ServicioMysql implements IService{

	@Override
	public String operacion() {
		return "Conectado a MySQL y ejecutando alguna operación";
	}
	
}
