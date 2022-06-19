package com.example.app.integration.repository;

import java.util.List;

import com.example.app.integration.model.Student;

public interface StudentRepository {
	public List<Student> findAll();
	public Student findById(String string);
	public void save(Student student);
	public void delete(String id);
}
