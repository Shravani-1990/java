package com.wipro.java.abstraction;

public class SUV extends Car {
	private boolean hasFourWheelDrive;

	public SUV(String brand, String model, int year, boolean hasFourWheelDrive) {
		// TODO Auto-generated constructor stub
		this.hasFourWheelDrive = hasFourWheelDrive;
	}

	@Override
	public void displayDetails() {
		System.out.println("Car Details: " + getBrand()+" "+ getModel() + " ("+ getYear() + ")");
		System.out.println("Type: SUV");
		System.out.println("Four-Wheel Drive: "+(hasFourWheelDrive ? "Enabled" : "Disabled"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car suv = new SUV("Jeep","Wrangler",2021, true);
		suv.displayDetails();
		suv.startEngine();
		System.out.println();

	}

}
