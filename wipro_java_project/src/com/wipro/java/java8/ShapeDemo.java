package com.wipro.java.java8;

@FunctionalInterface
interface Shape {
    // Single abstract method
    double area();

    // Default method 1
    default void displayInfo() {
        System.out.println("Calculating area of the shape...");
    }

    // Default method 2
    default void shapeType() {
        System.out.println("This is a generic shape.");
    }

    // Static method 1
    static void description() {
        System.out.println("Shapes are geometric figures that have area.");
    }

    // Static method 2
    static void utilityMethod() {
        System.out.println("This is a utility method for shapes.");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        // Implementing Shape interface using Lambda expression for a rectangle
        Shape rectangle = () -> {
            double length = 8;
            double width = 4;
            return length * width;
        };

        // Implementing Shape interface using Lambda expression for a circle
        Shape circle = () -> {
            double radius = 5;
            return Math.PI * radius * radius;
        };

        // Using default methods
        rectangle.displayInfo();
        System.out.println("Rectangle Area: " + rectangle.area());
        rectangle.shapeType();

        circle.displayInfo();
        System.out.println("Circle Area: " + circle.area());
        circle.shapeType();

        // Calling static methods
        Shape.description();
        Shape.utilityMethod();
    }
}

