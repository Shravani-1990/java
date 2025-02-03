package com.wipro.java.oops;

/**
 * Parent class = Employee
 * Child class = Developer
 * Extends = is a keyword
 */
public class Developer extends Employee {

	public Developer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Developer();
		employee.setEmpid(8950);
		employee.setName("nagaraj");
		employee.setSalary(67000);
		
		System.out.println(employee.getEmpid());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());

	}

}
