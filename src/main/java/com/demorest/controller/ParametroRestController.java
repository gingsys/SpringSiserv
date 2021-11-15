package com.demorest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demorest.DTO.ParametroDTO;
import com.demorest.service.ParametroService;

@RestController
@RequestMapping("/parametro")
public class ParametroRestController {
	
	@Autowired
	private ParametroService parametroService;
	
	static final Integer TIPO_DOCUMENTO = 1;
	static final Integer TIPO_ATENCION = 5;
	static final Integer ESTADO_ATENCION = 9;
	static final Integer ESTADO_SOLICITUD = 13;
	
	@GetMapping("/listarTipoDocumento")
	public ResponseEntity<?> listarTipoDocumento(){
		List<ParametroDTO> parametro = parametroService.buscarPorPadre(TIPO_DOCUMENTO);
		return new ResponseEntity<>(parametro,HttpStatus.OK);
	}	
	
	@GetMapping("/listarTipoAtencion")
	public ResponseEntity<?> listarTipoAtencion(){
		List<ParametroDTO> parametro = parametroService.buscarPorPadre(TIPO_ATENCION);
		return new ResponseEntity<>(parametro,HttpStatus.OK);
	}
	
	@GetMapping("/listarEstadoAtencion")
	public ResponseEntity<?> listarEstadoAtencion(){
		List<ParametroDTO> parametro = parametroService.buscarPorPadre(ESTADO_ATENCION);
		return new ResponseEntity<>(parametro,HttpStatus.OK);
	}
	
	@GetMapping("/listarEstadoSolicitud")
	public ResponseEntity<?> listarEstadoSolicitud(){
		List<ParametroDTO> parametro = parametroService.buscarPorPadre(ESTADO_SOLICITUD);
		return new ResponseEntity<>(parametro,HttpStatus.OK);
	}

}
