package com.wipro.java.linkedlist;

import java.util.*;

//Person class with name and age
class Person {
 String name;
 int age;

 // Constructor
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // toString method for displaying person details
 @Override
 public String toString() {
     return "Person{name='" + name + "', age=" + age + "}";
 }
}

//Comparator to sort persons by name
class NameComparator implements Comparator<Person> {
 @Override
 public int compare(Person p1, Person p2) {
     return p1.name.compareTo(p2.name); // Sorting in ascending order
 }
}

//Main class
public class LinkedListSorting {
 public static void main(String[] args) {
     // Creating a LinkedList of Person objects
     LinkedList<Person> people = new LinkedList<>();
     people.add(new Person("Shravani", 30));
     people.add(new Person("Harish", 25));
     people.add(new Person("Nagaraj", 35));

     System.out.println("Before Sorting:");
     for (Person p : people) {
         System.out.println(p);
     }

     // Sorting using Comparator
     Collections.sort(people, new NameComparator());

     System.out.println("\nAfter Sorting by Name:");
     for (Person p : people) {
         System.out.println(p);
     }
 }
}

