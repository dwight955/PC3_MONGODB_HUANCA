package com.cibertec.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "tipo_riesgo")
public class TipoRiesgo {

	private int idTipoRiesgo;
	private String calificacion;
	private int flag;	
	
}



