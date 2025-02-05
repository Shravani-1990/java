package com.wipro.java.interfaces;

//Parent Class: Animal
class Animal {
 String name;

 Animal(String name) {
     this.name = name;
 }

 void eat() {
     System.out.println(name + " is eating.");
 }

 void sleep() {
     System.out.println(name + " is sleeping.");
 }
}

//Interface 1: CanRun
interface CanRun {
 void run();
}

//Interface 2: CanBark
interface CanBark {
 void bark();
}

//Child Class: Dog (Single-Level Inheritance from Animal, Multiple Interface Implementation)
class Dog extends Animal implements CanRun, CanBark {

 Dog(String name) {
     super(name);
 }

 @Override
 public void run() {
     System.out.println(name + " is running.");
 }

 @Override
 public void bark() {
     System.out.println(name + " is barking.");
 }
}

//Main Class to Test the Code
public class Main {
 public static void main(String[] args) {
     Dog dog = new Dog("Buddy");
     
     // Methods from Animal (Parent Class)
     dog.eat();
     dog.sleep();

     // Methods from Interfaces
     dog.run();
     dog.bark();
 }
}

