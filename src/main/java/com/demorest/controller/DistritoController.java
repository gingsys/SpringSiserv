package com.demorest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demorest.model.Distrito;
import com.demorest.service.DistritoService;

@RestController
@RequestMapping("/distrito")
public class DistritoController {
	
	@Autowired
	private DistritoService distritoService;
	
	@GetMapping("/listar") //Http Method GET
	public ResponseEntity<?> listar() {
		List<Distrito> distrito = distritoService.findAll();		
		return new ResponseEntity<>(distrito,HttpStatus.OK); //Http status code
	}

}
