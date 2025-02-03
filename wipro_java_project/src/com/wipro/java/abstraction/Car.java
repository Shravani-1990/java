package com.wipro.java.abstraction;

public abstract class Car {
	private String brand;
	private String model;
	private int year;
	
	public abstract void displayDetails();
	
	public void startEngine() {
		System.out.println(brand + " "+ model+ "engine started.");
	}
	
	public String getBrand() {
		return brand;
	}


	public String getModel() {
		return model;
	}

	

	public int getYear() {
		return year;
	}

	

	public Car() {
		// TODO Auto-generated constructor stub
	}
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
