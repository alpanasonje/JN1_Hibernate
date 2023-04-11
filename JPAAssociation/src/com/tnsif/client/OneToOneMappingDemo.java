package com.tnsif.client;

import com.tnsif.entities.Address;
import com.tnsif.entities.Person;
import com.tnsif.service.AddressService;
import com.tnsif.service.AddressServiceImpl;
import com.tnsif.service.PersonService;
import com.tnsif.service.PersonServiceImpl;

public class OneToOneMappingDemo {

	public static void main(String[] args) {
		AddressService addressService;
		Address addrObj;
		PersonService personService;
		Person personObj;
	
		
		addrObj=new Address();
		addrObj.setStreet("MG Road");
		addrObj.setCity("Nashik");
		addrObj.setPincode(422002);
		
		personObj=new Person();
		personObj.setName("Amita");
		personObj.setContactNo("7887889800");
		personObj.setAddress(addrObj);
		
		addressService=new AddressServiceImpl();
		personService=new PersonServiceImpl();
		
		
		personService.addPerson(personObj);
		
		Address a=addressService.getAddress(1);
		System.out.println(a);
		

	}

}
