package com.tnsif.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory factory;
	private static EntityManager em;
	
	static
	{
		factory=Persistence.createEntityManagerFactory("PUnit");
		em=factory.createEntityManager();
	}
	
	public static EntityManager getEntityManager()
	{
		return em;
	}
		
	public static void beginTransaction() {
		em.getTransaction().begin();
		
	}

	public static void commitTransaction() {
		em.getTransaction().commit();
		
	}
}
