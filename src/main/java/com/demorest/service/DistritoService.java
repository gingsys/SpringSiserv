package com.demorest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demorest.model.Distrito;
import com.demorest.repository.DistritoRepository;

@Service
@Transactional
public class DistritoService {
	
	@Autowired
	private DistritoRepository distritoRepository;
	
	public DistritoService() {
		
	}
	
	public List<Distrito> findAll() {		
		List<Distrito> distritos = distritoRepository.findAll();		
		return distritos;
	}

}