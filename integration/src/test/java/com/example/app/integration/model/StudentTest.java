package com.example.app.integration.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {
	private Student student;
	
	@BeforeEach
	void setUp() throws Exception {
		student = new Student();
	}

	@Test
	void test() {
		student.setId("1");
		student.setName("Marco");
		assertEquals("Student [id=1, name=Marco]", student.toString());
	}

}
