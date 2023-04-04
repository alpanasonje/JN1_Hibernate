package com.tnsif.dao;

import javax.persistence.EntityManager;

import com.tnsif.entities.Student;

public class StudentDaoImpl implements StudentDao {
	private EntityManager em;

	public StudentDaoImpl() {
		em = JPAUtil.getEntityManager();
	}

	@Override
	public void addStudent(Student Student) {
		em.persist(Student);

	}

	@Override
	public Student getStudent(int id) {
		Student p=em.find(Student.class,id);
		return p;
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();

	}

}
