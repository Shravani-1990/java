package com.wipro.java.oops.inheritance;

public class SUV extends Car {

	public SUV() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car= new SUV();
		car.setBrand("Benz");
		car.setCarName("Benz MS Performance");
		car.setModel("PS");
		
		System.out.println(car.getBrand());
		System.out.println(car.getCarName());
		System.out.println(car.getModel());


	}

}
