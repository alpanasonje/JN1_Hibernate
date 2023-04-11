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
		
		  p.setId(10); p.setName("Aniket"); p.setCity("Nashik"); service.addPerson(p);
		 

		System.out.println("-------------------------");

		Person pp = service.getPerson(10);
		System.out.println(pp);
		
		StudentService sservice;
		sservice=new StudentServiceImpl();
		
		Student s=new Student();
		s.setId(103);
		s.setCity("Pune");
		s.setName("Abhijit");
		s.setCourse("MCA");
		s.setPer(82);

		sservice.addStudent(s);
	}

}
