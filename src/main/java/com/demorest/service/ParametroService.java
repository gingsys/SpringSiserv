package com.demorest.service;

import java.util.Collection;

import com.demorest.model.Parametro;

public interface ParametroService {
	
	public abstract void insert(Parametro parametro);
	public abstract void update(Parametro parametro);
	public abstract void delete(Integer parametroId);
	public abstract Parametro findById(Integer parametroId);
	public abstract Parametro findByIdParametroPadre(Integer parametroPadreId);
	public abstract Collection<Parametro> findAll();

}
