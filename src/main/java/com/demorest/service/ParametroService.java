package com.demorest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demorest.DTO.ParametroDTO;

import com.demorest.repository.ParametroRepository;

@Service

public class ParametroService {
	
	@Autowired
	private ParametroRepository parametroRepository;
	
	public ParametroService() {		
	}
	
	public List<ParametroDTO> buscarPorPadre(Integer idParametroPadre){
		List<ParametroDTO> parametro = parametroRepository.buscarPorPadre(idParametroPadre);
		return parametro;
	}

}
