package com.wipro.java.oops;

/**NO constructor
 * Getters have return value
 * Setters have no return value
 * properties are determined using private fields
 * values are behaviours are determined to setters
 *
 */
public class Animal {
	//Private properties = structure
	private String name;
	private String species;
	private int age;
	private float weight;
	
	//Getter for name
	public String getName() {
		return name;
	}

	// Setter for name
	public void setName(String name) {
		this.name = name;
	}

	// Getter for species
	public String getSpecies() {
		return species;
	}

	// Setter for species
	public void setSpecies(String species) {
		this.species = species;
	}

	// Getter for age
	public int getAge() {
		return age;
	}

	// Setter for age
	public void setAge(int age) {
		this.age = age;
	}

	// Getter for weight
	public float getWeight() {
		return weight;
	}

	// Setter for weight
	public void setWeight(float weight) {
		this.weight = weight;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
