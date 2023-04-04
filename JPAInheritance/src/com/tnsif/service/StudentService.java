package com.tnsif.service;

import com.tnsif.entities.Student;

public interface StudentService {
	void addStudent(Student Student);
	Student getStudent(int id);
}
