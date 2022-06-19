package com.example.app.integration.controller;

import com.example.app.integration.model.Student;
import com.example.app.integration.repository.StudentRepository;
import com.example.app.integration.view.StudentView;

public class SchoolController {

	private StudentView studentView;
	private StudentRepository studentRepository;

	public void allStudents() {
		studentView.showAllStudents(studentRepository.findAll());
	}

	public void newStudent(Student student) {
		Student existingStudent = studentRepository.findById(student.getId());
		if (existingStudent != null) {
			studentView.showError("Already existing student with id " + student.getId(), existingStudent);
			return;
		}
		studentRepository.save(student);
		studentView.studentAdded(student);

	}

	public void deleteStudent(Student student) {
		if (studentRepository.findById(student.getId()) == null) {
			studentView.showError("No existing student with id " + student.getId(), student);
			return;
		}

		studentRepository.delete(student.getId());
		studentView.studentRemoved(student);

	}

}
