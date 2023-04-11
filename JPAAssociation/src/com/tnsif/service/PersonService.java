package com.tnsif.service;

import com.tnsif.entities.Person;

public interface PersonService {
	void addPerson(Person person);
	Person getPerson(int id);
}
