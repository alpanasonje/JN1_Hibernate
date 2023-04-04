package com.tnsif.service;

import com.tnsif.dao.StudentDao;
import com.tnsif.dao.StudentDaoImpl;
import com.tnsif.entities.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDao dao;

	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}

	@Override
	public void addStudent(Student Student) {
		dao.beginTransaction();
		dao.addStudent(Student);
		dao.commitTransaction();
	}

	@Override
	public Student getStudent(int id) {

		return dao.getStudent(id);
	}

}
