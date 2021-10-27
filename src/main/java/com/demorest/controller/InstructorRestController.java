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
import com.demorest.model.Instructor;
import com.demorest.service.InstructorService;


@RestController
@RequestMapping("/instructor")
public class InstructorRestController {
	
	@Autowired
	private InstructorService instructorService;
	
	@GetMapping("/listar") //Http Method GET
	public ResponseEntity<?> listar() {
		Collection<Instructor> itemsInstructor=instructorService.findAll();		
		return new ResponseEntity<>(itemsInstructor,HttpStatus.OK); //Http status code
	}
	
	@GetMapping("/buscar/{instructorId}") //Http Method GET
	public ResponseEntity<?> buscar(@PathVariable Integer instructorId) {
		Instructor instructor=instructorService.findById(instructorId);		
		if(instructor!=null) {
			return new ResponseEntity<>(instructor,HttpStatus.OK); //Http status code
		}		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND); //Http status code
	}
	
	@PostMapping("/agregar") //Http Method POST
	public ResponseEntity<?> agregar(@RequestBody Instructor instructor) {
		instructorService.insert(instructor);		
		return new ResponseEntity<Void>(HttpStatus.CREATED); //Http status code	
	}
	
	@PutMapping("/editar/{instructorId}") //Http Method PUT
	public ResponseEntity<?> editar(@PathVariable Integer instructorId,
                                        @RequestBody Instructor newInstructor) {		
		Instructor instructor=instructorService.findById(instructorId);		
		if(instructor!=null) {
			instructor.setNombre(newInstructor.getNombre());
			instructor.setApellidos(newInstructor.getApellidos());
			instructor.setPassword(newInstructor.getPassword());
			instructor.setEmail(newInstructor.getEmail());
			instructor.setFregistro(newInstructor.getFregistro());			
			instructorService.update(instructor);			
			return new ResponseEntity<Void>(HttpStatus.OK); //Http status code
		}		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND); //Http status code
	}
	
	@DeleteMapping("/borrar/{instructorId}") //Http Method DELETE
	public ResponseEntity<?> borrar(@PathVariable Integer instructorId)
	{
		Instructor instructor=instructorService.findById(instructorId);
		
		if(instructor!=null) {
			instructorService.delete(instructorId);
			return new ResponseEntity<Void>(HttpStatus.OK); //Http status code
		}		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND); //Http status code
	}



}
