package com.wipro.java.oops;

/**
 * Parent class = Employee
 * Child class = Manager
 * Extends = is a keyword
 */
public class Manager extends Employee {

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Manager();
		employee.setEmpid(4567);
		employee.setName("harish");
		employee.setSalary(50000);
		
		System.out.println(employee.getEmpid());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());

	}

}
