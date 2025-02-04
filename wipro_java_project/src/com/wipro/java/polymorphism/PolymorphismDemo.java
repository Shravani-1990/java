package com.wipro.java.polymorphism;

//Base Class
class Shape {
	void draw() {
		System.out.println("Drawing a shape");
	}
}

// Derived class 1
class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing a circle");
	}
}

// Derived class 2
class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing a rectangle");
	}
}
// Main class to demonstrate Polymorphism
public class PolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape1 = new Circle();
		Shape shape2 = new Rectangle();
		Shape shape3 = new Shape();
		
		shape1.draw();
		shape2.draw();
		shape3.draw();
		
		Shape[] shapes = {new Circle(), new Rectangle(), new Shape()};
		System.out.println("\n Using an array of shape objects:");
		for (Shape shape : shapes) {
			shape.draw();
		}


	}

}
