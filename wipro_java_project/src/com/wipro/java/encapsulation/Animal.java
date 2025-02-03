package com.wipro.java.encapsulation;

public class Animal {
	private String name;
	private String species;
	private int age;
	private double weight;
	
	public Animal(String name, String species, int age, double weight) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.species=species;
		setAge(age);
		setWeight(weight);
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight > 0) {
			this.weight = weight;
		} else {
			System.out.println("Weight must be positive");
		}
	}


	public void displayDetails() {
		System.out.println("Animal Details:");
		System.out.println("Name:" + name);
		System.out.println("Species:" + species);
		System.out.println("Age:" + age);
		System.out.println("Weight:" + weight + "kg");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal= new Animal("Max","Dog", 5, 20);
		animal.displayDetails();
		System.out.println("\n Updating Animal Details...\n");
		
		animal.setAge(6);
		animal.setWeight(22.0);
		animal.setName("Buddy");
		animal.setSpecies("Golden Retriever");
		
		animal.setAge(-2);
		animal.setWeight(-5);
		
		//Displaying updated details
		animal.displayDetails();
	
	}

}
