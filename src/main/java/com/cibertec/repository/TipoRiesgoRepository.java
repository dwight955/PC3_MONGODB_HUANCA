package com.cibertec.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cibertec.entity.TipoRiesgo;

public interface TipoRiesgoRepository extends MongoRepository<TipoRiesgo, Integer>{

}
