package com.tnsif.service;

import com.tnsif.dao.PersonDao;
import com.tnsif.dao.PersonDaoImpl;
import com.tnsif.entities.Person;

public class PersonServiceImpl implements PersonService {
	private PersonDao dao;

	public PersonServiceImpl() {
		dao = new PersonDaoImpl();
	}

	@Override
	public void addPerson(Person person) {
		dao.beginTransaction();
		dao.addPerson(person);
		dao.commitTransaction();
	}

	@Override
	public Person getPerson(int id) {

		return dao.getPerson(id);
	}

}
