package com.tnsif.dao;

import javax.persistence.EntityManager;

import com.tnsif.entities.Person;

public class PersonDaoImpl implements PersonDao{
private static EntityManager em;
	
	public PersonDaoImpl()
	{
		em=JPAUtil.getEntityManager();
	}
	@Override
	public void addPerson(Person person) {
		JPAUtil.beginTransaction();
		em.persist(person);
		JPAUtil.commitTransaction();
	}

	@Override
	public Person getPerson(int id) {
		
		return em.find(Person.class, id);
	}

	

}
