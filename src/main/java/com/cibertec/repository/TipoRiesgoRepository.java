package com.cibertec.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cibertec.entity.TipoRiesgo;

public interface TipoRiesgoRepository extends MongoRepository<TipoRiesgo, Integer>{
	@Query("{idTipoRiesgo: ?0}")
	public Optional<TipoRiesgo> buscarPorId(int id);
}
