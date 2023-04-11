package com.tnsif.dao;

import com.tnsif.entities.Person;

public interface PersonDao {
	void addPerson(Person person);
	Person getPerson(int id);
}
