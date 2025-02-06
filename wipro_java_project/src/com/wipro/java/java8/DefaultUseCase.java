package com.wipro.java.java8;

//First Interface with a default method
interface InterfaceA {
 default void show() {
     System.out.println("Default method from InterfaceA");
 }
}

//Second Interface with a default method
interface InterfaceB {
 default void show() {
     System.out.println("Default method from InterfaceB");
 }
}

//Implementation class that implements both interfaces
class DefaultUseCase implements InterfaceA, InterfaceB {
 
 // Overriding show() method to resolve conflict
 public void show() {
     // Using super keyword to call specific interface method
     InterfaceA.super.show();
     InterfaceB.super.show();
 }

 public static void main(String[] args) {
     DefaultUseCase obj = new DefaultUseCase();
     obj.show(); // Calls both interface methods
 }
}
