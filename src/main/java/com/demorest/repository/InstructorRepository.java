package com.demorest.repository;

//import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demorest.model.Instructor;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor, Integer> {
	/*public abstract void insert(Instructor instructor);
	public abstract void update(Instructor instructor);
	public abstract void delete(Integer InstructorId);
	public abstract Instructor findById(Integer instructorId);
	public abstract Collection<Instructor> findAll();*/
}
