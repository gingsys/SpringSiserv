package com.demorest.service;
import java.util.Collection;

import com.demorest.model.Instructor;

public interface InstructorService {
	
	public abstract void insert(Instructor instructor);
	public abstract void update(Instructor instructor);
	public abstract void delete(Integer instructorId);
	public abstract Instructor findById(Integer instructorId);
	public abstract Collection<Instructor> findAll();


}
