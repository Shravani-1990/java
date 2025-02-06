package com.wipro.java.collection;

import java.util.*;

//Animal class implementing Comparable for sorting by age
class Animal implements Comparable<Animal> {
 private String name;
 private int age;

 // Constructor
 public Animal(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getters
 public String getName() { return name; }
 public int getAge() { return age; }

 // Comparable: Default sorting by age (Ascending)
 @Override
 public int compareTo(Animal other) {
     return Integer.compare(this.age, other.age);
 }

 // toString method for display
 @Override
 public String toString() {
     return name + " - Age: " + age;
 }
}

//Comparator for sorting by name alphabetically
class AnimalNameComparator implements Comparator<Animal> {
 @Override
 public int compare(Animal a1, Animal a2) {
     return a1.getName().compareTo(a2.getName());
 }
}

//Main class to test sorting
public class AnimalSorting {
 public static void main(String[] args) {
     List<Animal> animals = new ArrayList<>();
     animals.add(new Animal("Zebra", 5));
     animals.add(new Animal("Elephant", 10));
     animals.add(new Animal("Lion", 7));
     animals.add(new Animal("Tiger", 4));
     animals.add(new Animal("Monkey", 6));

     // Sorting by age using Comparable (Natural Order)
     Collections.sort(animals);
     System.out.println("Animals sorted by age:");
     for (Animal a : animals) {
         System.out.println(a);
     }

     // Sorting by name using Comparator
     Collections.sort(animals, new AnimalNameComparator());
     System.out.println("\nAnimals sorted by name:");
     for (Animal a : animals) {
         System.out.println(a);
     }
 }
}

