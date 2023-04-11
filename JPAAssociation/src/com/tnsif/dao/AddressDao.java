package com.tnsif.dao;

import com.tnsif.entities.Address;


public interface AddressDao {
	void addAddress(Address address);
	Address getAddress(int id);	
}
