package com.wipro.java.oops.inheritance;

public class Car {
	
	private String Brand;
	private String CarName;
	private String Model;
	
	@Override
	public String toString() {
		return "Car [Brand=" + Brand + ", CarName= " + CarName +", Model=" + Model+"]";
	}
	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	
	public String getCarName() {
		return CarName;
	}

	public void setCarName(String carName) {
		CarName = carName;
	}

	

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
