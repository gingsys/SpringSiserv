package com.demorest.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demorest.model.Parametro;
import com.demorest.repository.ParametroRepository;

@Service
public class ParametroServiceImpl implements ParametroService{
	
	@Autowired
	private ParametroRepository repository;

	@Override
	@Transactional
	public void insert(Parametro parametro) {
		repository.save(parametro);		
	}

	@Override
	@Transactional
	public void update(Parametro parametro) {
		repository.save(parametro);		
	}

	@Override
	@Transactional
	public void delete(Integer parametroId) {
		repository.deleteById(parametroId);		
	}

	@Override
	@Transactional(readOnly = true)
	public Parametro findById(Integer parametroId) {
		return repository.findById(parametroId).orElse(null);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Parametro findByIdParametroPadre(Integer parametroPadreId) {
		return repository.findByIdParametroPadre(parametroPadreId);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Collection<Parametro> findAll() {
		return (Collection<Parametro>)repository.findAll();
	}

}
