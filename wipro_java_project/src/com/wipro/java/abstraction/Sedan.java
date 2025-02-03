package com.wipro.java.abstraction;


public class Sedan extends Car {
	private boolean hasSunroof;
	
	public Sedan(String brand, String model, int year, boolean hasSunroof) {
		this.hasSunroof = hasSunroof;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayDetails() {
		System.out.println("Car Details: " + getBrand()+" "+ getModel() + " ("+ getYear() + ")");
		System.out.println("Type: Sedan");
		System.out.println("Sunroof: "+(hasSunroof ? "Yes" : "No"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car sedan = new Sedan("Honda","Accord",2020, true);
		sedan.displayDetails();
		sedan.startEngine();
		System.out.println();

	}

}
