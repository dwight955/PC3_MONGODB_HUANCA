package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.entity.TipoRiesgo;

public interface TipoRiesgoService {

	public List<TipoRiesgo> listaTipoRiesgo();
	public TipoRiesgo insertaTipoRiesgo(TipoRiesgo obj);
	public Optional<TipoRiesgo> buscaTipoRiesgo(int idTipoRiesgo);
	public void eliminaTipoRiesgo(int idTipoRiesgo);
	
}
