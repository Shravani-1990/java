package com.wipro.java.oops.inheritance;

public class Sedan extends Car {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1= new Sedan();
		car1.setBrand("BMW");
		car1.setCarName("BMW MS Performance");
		car1.setModel("MS");
		
		System.out.println(car1.getBrand());
		System.out.println(car1.getCarName());
		System.out.println(car1.getModel());

	}

}
