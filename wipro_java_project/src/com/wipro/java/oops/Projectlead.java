package com.wipro.java.oops;

public class ProjectLead extends Employee {

	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Child object is instantiated from child constructor
		//Parent class consumes the properties and behaviours of child class
		Employee employee = new ProjectLead();
		employee.setEmpid(1234);
		employee.setName("shravani");
		employee.setSalary(40000);
		
		System.out.println(employee.getEmpid());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());

	}

}
