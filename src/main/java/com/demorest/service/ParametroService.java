package com.demorest.service;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demorest.model.Parametro;
import com.demorest.repository.ParametroRepository;

@Service
@Transactional
public class ParametroService {
	
	@Autowired
	private ParametroRepository repository;
	
	public ParametroService() {
		
	}
	
	public Parametro insert(Parametro parametro) {
		Parametro parametroCreado = repository.save(parametro);
		return parametroCreado;
	}
	
	public void update(Parametro parametro) {
		repository.save(parametro);
	}
	
	public void delete(Integer idParametro) {
		repository.deleteById(idParametro);
	}
	
	public Parametro findById(Integer idParametro) {
		return repository.findById(idParametro).orElse(null);
	}
	
	public Collection<Parametro> findAll(){
		return (Collection<Parametro>) repository.findAll();
	}
	
	//public Collection<Parametro> findByIdParametroPadre(int idParametroPadre){
	//	return repository.findByIdParametroPadre(idParametroPadre);
	//}

}
