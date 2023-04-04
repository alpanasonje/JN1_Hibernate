package com.tnsif.dao;

import javax.persistence.EntityManager;

import com.tnsif.entities.Person;

public class PersonDaoImpl implements PersonDao {
	private EntityManager em;

	public PersonDaoImpl() {
		em = JPAUtil.getEntityManager();
	}

	@Override
	public void addPerson(Person person) {
		em.persist(person);

	}

	@Override
	public Person getPerson(int id) {
		Person p=em.find(Person.class,id);
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
