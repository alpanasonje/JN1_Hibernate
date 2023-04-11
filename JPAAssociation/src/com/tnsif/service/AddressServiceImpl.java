package com.tnsif.service;

import com.tnsif.dao.AddressDao;
import com.tnsif.dao.AddressDaoImpl;
import com.tnsif.entities.Address;

public class AddressServiceImpl implements AddressService{
	private static AddressDao dao;
	
	public AddressServiceImpl()
	{
		dao=new AddressDaoImpl();
	}
	
	@Override
	public void addAddress(Address address) {
		dao.addAddress(address);
		
	}

	@Override
	public Address getAddress(int id) {
		
		return dao.getAddress(id);
	}

}
