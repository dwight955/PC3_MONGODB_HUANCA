package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.TipoRiesgo;
import com.cibertec.repository.TipoRiesgoRepository;

@Service
public class TipoRiesgoServiceImpl implements TipoRiesgoService {

	@Autowired
	private TipoRiesgoRepository repository;

	@Override
	public List<TipoRiesgo> listaTipoRiesgo() {
		return repository.findAll();
	}

	@Override
	public TipoRiesgo insertaTipoRiesgo(TipoRiesgo obj) {
		return repository.save(obj);
	}

	@Override
	public Optional<TipoRiesgo> buscaTipoRiesgo(int idTipoRiesgo) {
		return repository.buscarPorId(idTipoRiesgo);
	}

	@Override
	public void eliminaTipoRiesgo(int idTipoRiesgo) {
		repository.deleteById(idTipoRiesgo);
	}


}


