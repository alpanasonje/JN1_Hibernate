package com.tnsif.service;

import com.tnsif.dao.PersonDao;
import com.tnsif.dao.PersonDaoImpl;
import com.tnsif.entities.Person;

public class PersonServiceImpl implements PersonService{
	private static PersonDao dao;

	public PersonServiceImpl() {
		dao = new PersonDaoImpl();
	}

	@Override
	public void addPerson(Person person) {
		dao.addPerson(person);
		
	}

	@Override
	public Person getPerson(int id) {
		
		return dao.getPerson(id);
	}
}
