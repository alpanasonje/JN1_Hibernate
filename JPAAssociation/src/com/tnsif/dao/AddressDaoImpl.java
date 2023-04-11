package com.tnsif.dao;

import javax.persistence.EntityManager;

import com.tnsif.entities.Address;

public class AddressDaoImpl implements AddressDao{
	private static EntityManager em;
	
	public AddressDaoImpl()
	{
		em=JPAUtil.getEntityManager();
	}
	@Override
	public void addAddress(Address address) {
		JPAUtil.beginTransaction();
		em.persist(address);	
		JPAUtil.commitTransaction();
	}

	@Override
	public Address getAddress(int id) {
		
		return em.find(Address.class, id);
	}

	

}
