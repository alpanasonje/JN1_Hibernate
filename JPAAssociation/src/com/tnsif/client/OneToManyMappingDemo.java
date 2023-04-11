package com.tnsif.client;

import java.util.HashSet;
import java.util.Set;

import com.tnsif.entities.Address;
import com.tnsif.entities.Person;
import com.tnsif.entities.Student;

import com.tnsif.service.PersonService;
import com.tnsif.service.PersonServiceImpl;

public class OneToManyMappingDemo {

	public static void main(String[] args) {
	
		
		Address addrObj;
		PersonService personService;
		Person personObj;
	
		
		addrObj=new Address();
		addrObj.setStreet("FC Road");
		addrObj.setCity("Pune");
		addrObj.setPincode(411004);
		
		personObj=new Person();
		personObj.setName("Anjali");
		personObj.setContactNo("9090989800");
		personObj.setAddress(addrObj);
		
		
		personService=new PersonServiceImpl();
		
		
		Set<Student> studentSet=new HashSet<Student>();
		Student s1=new Student();
		s1.setRollNo(10);
		s1.setName("Pooja");
		s1.setCourse("BE");
		s1.setPer(77);
		studentSet.add(s1);
		
		s1=new Student();
		s1.setRollNo(11);
		s1.setName("Pratik");
		s1.setCourse("BE");
		s1.setPer(74);
		studentSet.add(s1);
		
		s1=new Student();
		s1.setRollNo(12);
		s1.setName("Pratiksha");
		s1.setCourse("BE");
		s1.setPer(64);
		studentSet.add(s1);
		
		s1=new Student();
		s1.setRollNo(13);
		s1.setName("Pranav");
		s1.setCourse("BE");
		s1.setPer(73);
		studentSet.add(s1);
		
		personObj.setStudents(studentSet);
		personService.addPerson(personObj);
		
		
		
	}

}
