package com.tnsif.client;

import com.tnsif.entities.Person;
import com.tnsif.service.PersonService;
import com.tnsif.service.PersonServiceImpl;
import com.tnsif.service.StudentService;
import com.tnsif.service.StudentServiceImpl;
import com.tnsif.entities.Student;
public class JPAInheritanceDemo {

	public static void main(String[] args) {
		Person p = new Person();
		PersonService service;

		service = new PersonServiceImpl();
		
		  p.setId(2); p.setName("Prajakta"); p.setCity("Pune"); service.addPerson(p);
		 

		System.out.println("-------------------------");

		Person pp = service.getPerson(2);
		System.out.println(pp);
		
		StudentService sservice;
		sservice=new StudentServiceImpl();
		
		Student s=new Student();
		s.setId(101);
		s.setCity("Nashik");
		s.setName("Amol");
		s.setCourse("BE");
		s.setPer(78);

		sservice.addStudent(s);
	}

}
