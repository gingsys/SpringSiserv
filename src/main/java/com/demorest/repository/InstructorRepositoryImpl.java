package com.demorest.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.demorest.model.Instructor;

@Repository
public class InstructorRepositoryImpl {

	public static Collection<Instructor> itemsInstructor=new ArrayList<>();
	
	//@Override
	public void insert(Instructor instructor) {
		itemsInstructor.add(instructor);
		
	}

	//@Override
	public void update(Instructor instructor) {
		Instructor oldInstructor=findById(instructor.getInstructorId());
		itemsInstructor.remove(oldInstructor);
		
		Instructor newInstructor=new Instructor(instructor);
		itemsInstructor.add(newInstructor);
		
	}

	//@Override
	public void delete(Integer instructorid) {
		Instructor instructor=findById(instructorid);
		itemsInstructor.remove(instructor);
		
	}

	//@Override
	public Instructor findById(Integer instructorId) {
		Optional<Instructor> instructor = 
				itemsInstructor.stream().filter(p->p.getInstructorId()==instructorId).findFirst();
		return instructor.orElse(null);
	}

	//@Override
	public Collection<Instructor> findAll() {
		return itemsInstructor;
	}

}
