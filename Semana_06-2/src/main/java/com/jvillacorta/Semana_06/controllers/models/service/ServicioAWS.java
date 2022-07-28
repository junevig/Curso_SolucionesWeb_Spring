package com.jvillacorta.Semana_06.controllers.models.service;

import org.springframework.stereotype.Service;

@Service("AWS")
public class ServicioAWS implements IService{

	@Override
	public String operacion() {
		return "Conectandose a AWS y consumiendo un servicio.";
	}

}
