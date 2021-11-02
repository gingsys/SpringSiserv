package com.demorest.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demorest.model.Parametro;
import com.demorest.service.ParametroService;

@RestController
@RequestMapping("/parametro")
public class ParametroRestController {
	
	@Autowired
	private ParametroService parametroService;
	
	@GetMapping("/listar") //Http Method GET
	public ResponseEntity<?> listar() {
		Collection<Parametro> itemsInstructor=parametroService.findAll();		
		return new ResponseEntity<>(itemsInstructor,HttpStatus.OK); //Http status code
	}
	
	@GetMapping("/buscar/{parametroId}") //Http Method GET
	public ResponseEntity<?> buscar(@PathVariable Integer parametroId) {
		Parametro parametro=parametroService.findById(parametroId);		
		if(parametro!=null) {
			return new ResponseEntity<>(parametro,HttpStatus.OK); //Http status code
		}		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND); //Http status code
	}
	
	//@GetMapping("/buscarpadre/{idParametroPadre}") //Http Method GET
	//public ResponseEntity<?> buscarPadre(@PathVariable int idParametroPadre) {
	//	Collection<Parametro> parametro = parametroService.findByIdParametroPadre(idParametroPadre);		
	//	if(parametro!=null) {
	//		return new ResponseEntity<>(parametro,HttpStatus.OK); //Http status code
	//	}		
	//	return new ResponseEntity<Void>(HttpStatus.NOT_FOUND); //Http status code
	//}
	
	@PostMapping("/agregar") //Http Method POST
	public ResponseEntity<?> agregar(@RequestBody Parametro parametro) {
		Parametro parametroCreado =  parametroService.insert(parametro);		
		return new ResponseEntity<>(parametroCreado, HttpStatus.CREATED); //Http status code	
	}
	
	@PutMapping("/editar/{parametroId}") //Http Method PUT
	public ResponseEntity<?> editar(@PathVariable Integer parametroId,
                                        @RequestBody Parametro newParametro) {		
		Parametro parametro = parametroService.findById(parametroId);		
		if(parametro!=null) {
			parametro.setIdParametroPadre(newParametro.getIdParametroPadre());
			parametro.setNombreParametro(newParametro.getNombreParametro());
			parametro.setEstadoRegistro(newParametro.getEstadoRegistro());
			parametro.setUsuarioModificacion(newParametro.getUsuarioModificacion());
			parametro.setFechaModificacion(newParametro.getFechaModificacion());
			parametroService.update(parametro);			
			return new ResponseEntity<Void>(HttpStatus.OK); //Http status code
		}		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND); //Http status code
	}
	
	@DeleteMapping("/borrar/{idParametro}") //Http Method DELETE
	public ResponseEntity<?> borrar(@PathVariable Integer idParametro)
	{
		Parametro parametro=parametroService.findById(idParametro);
		
		if(parametro!=null) {
			parametroService.delete(idParametro);
			return new ResponseEntity<Void>(HttpStatus.OK); //Http status code
		}		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND); //Http status code
	}

}
