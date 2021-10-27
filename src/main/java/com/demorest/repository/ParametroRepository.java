package com.demorest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demorest.model.Parametro;

@Repository
public interface ParametroRepository extends CrudRepository<Parametro, Integer> {
	
	public abstract Parametro findByIdParametroPadre(Integer parametroPadreId);

}
