package com.demorest.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.demorest.model.Parametro;

@Repository
public class ParametroRepositoryImpl {
	
public static Collection<Parametro> itemsParamtero=new ArrayList<>();
	
	//@Override
	public void insert(Parametro parametro) {
		itemsParamtero.add(parametro);
		
	}

	//@Override
	public void update(Parametro parametro) {
		Parametro oldParametro=findById(parametro.getIdParametro());
		itemsParamtero.remove(oldParametro);
		
		Parametro newParametro=new Parametro(parametro);
		itemsParamtero.add(newParametro);
		
	}

	//@Override
	public void delete(Integer parametroId) {
		Parametro parametro=findById(parametroId);
		itemsParamtero.remove(parametro);
		
	}

	//@Override
	public Parametro findById(Integer parametroId) {
		Optional<Parametro> parametro = 
				itemsParamtero.stream().filter(p->p.getIdParametro()==parametroId).findFirst();
		return parametro.orElse(null);
	}
	
	//@Override
	public Parametro findByIdParametroPadre(Integer parametroPadreId) {
		Optional<Parametro> parametro = 
				itemsParamtero.stream().filter(p->p.getIdParametroPadre()==parametroPadreId).findFirst();
		return parametro.orElse(null);
	}

	//@Override
	public Collection<Parametro> findAll() {
		return itemsParamtero;
	}

}
