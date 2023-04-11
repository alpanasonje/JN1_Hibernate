package com.tns.jpql;

import java.util.List;

public class JPQLDemo {

	public static void main(String[] args) {
		
		  Employee e1=new Employee(); e1.setId(1001); e1.setName("Pankaj");
		  e1.setSalary(45000); e1.setDepartmentName("Account");
		  EmployeeService.addEmployee(e1);
		  
		  e1=new Employee(); e1.setId(1002); e1.setName("Pankaja");
		  e1.setSalary(51000); e1.setDepartmentName("Sales");
		  EmployeeService.addEmployee(e1);
		  
		  e1=new Employee(); e1.setId(1003); e1.setName("Pratik"); e1.setSalary(76000);
		  e1.setDepartmentName("IT"); EmployeeService.addEmployee(e1);
		  
		  e1=new Employee(); e1.setId(1004); e1.setName("Pratiksha");
		  e1.setSalary(87000); e1.setDepartmentName("IT");
		  EmployeeService.addEmployee(e1);
		  
			

		List<Employee> list = EmployeeService.getAllEmployeesByDept("Account");
		System.out.println(list);
		System.out.println("-------------------------------");
		list = EmployeeService.getAllEmployeesWithinSalaryRange(60000, 90000);
		System.out.println(list);

		System.out.println("-------------------------------");
		list = EmployeeService.getAllEmployees();
		System.out.println(list);

		int n=EmployeeService.updateSalaryOfAllEmployeesByDept("IT");
		if (n>0)
				System.out.println(n+" Records updated");
		System.out.println("-------------------------------");
		
		list=EmployeeService.getAllEmployees();
		System.out.println(list);
	}

}

