package com.tnsif.service;

import com.tnsif.entities.Address;

public interface AddressService {
	void addAddress(Address address);
	Address getAddress(int id);	
}
