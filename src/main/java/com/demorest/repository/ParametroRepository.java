package com.demorest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demorest.model.Parametro;

@Repository
public interface ParametroRepository extends CrudRepository<Parametro, Integer> {
	
	//@Query("SELECT p FROM parametro p WHERE p.id_parametro_padre = ?1")
	//public List<Parametro> findByIdParametroPadre(int idParametroPadre);

}
