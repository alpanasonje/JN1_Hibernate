package com.tnsif.dao;

import com.tnsif.entities.Student;

public interface StudentDao {
	void addStudent(Student student);
	Student getStudent(int id);
	
}
