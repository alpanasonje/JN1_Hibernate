package com.tns.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


import com.tnsif.dao.JPAUtil;


public class EmployeeService {
	private static EntityManager em;

	static {
		em = JPAUtil.getEntityManager();
	}

	public static void addEmployee(Employee s) {
		em.getTransaction().begin();
		em.persist(s);
		em.getTransaction().commit();
		System.out.println("Record added...");
	}

	public static void updateEmployee1(Employee s) {
		em.getTransaction().begin();
		em.merge(s);
		em.getTransaction().commit();
		System.out.println("Record updated...");
	}
	public static void removeEmployee1(Employee s)
	{
		em.getTransaction().begin();
		em.remove(s);
		em.getTransaction().commit();
		System.out.println("Record Deleted...");
	}
	public static Employee getEmployee1(int id)
	{
		Employee s=em.find(Employee.class, id);
		return s;	
	}
	
	//list all the Employee1s working on given department
	public static List<Employee> getAllEmployeesByDept(String departmentname)
	{
		List<Employee> empList=null;
		String qstr="SELECT e FROM Employee e WHERE departmentName='"+departmentname+"'";
		TypedQuery<Employee> query=em.createQuery(qstr,Employee.class);
		empList=query.getResultList();
		return empList;
	}
	
	
	//update salary of all the Employee1s working on given department
		public static int updateSalaryOfAllEmployeesByDept(String departmentname)
		{
			
			String qstr="UPDATE Employee e SET salary=salary+salary*0.10 WHERE departmentName='"+departmentname+"'";
			Query query=em.createQuery(qstr);
			em.getTransaction().begin();
			int n=query.executeUpdate();
			em.getTransaction().commit();
			return n;
		}
	//list all the Employee1s within given salary range
		public static List<Employee> getAllEmployeesWithinSalaryRange(double s1, double s2)
		{
			List<Employee> empList=null;
			String qstr="SELECT e FROM Employee e WHERE e.salary BETWEEN :start AND :end";
			TypedQuery<Employee> query=em.createQuery(qstr,Employee.class);
			query.setParameter("start",s1);
			query.setParameter("end",s2);
			empList=query.getResultList();
			return empList;
		}
		
		//list all employess
		public static List<Employee> getAllEmployees()
		{
			List<Employee> empList=null;
			TypedQuery<Employee> query=em.createNamedQuery("getAllEmployees",Employee.class);
			empList=query.getResultList();
			return empList;
		}
}
