package com.wipro.java.exception;

import java.io.* ;
public class ExceptionDemo {

    public static void main(String[] args) {
        // Demonstrate Checked Exception
        try {
            readFile("nonexistent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception Caught: " + e.getMessage());
        }

        // Demonstrate Unchecked Exception
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception Caught: " + e.getMessage());
        }
    }

    // Method that throws a checked exception
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file); // This will throw FileNotFoundException if the file doesn't exist
    }

    // Method that may cause an unchecked exception
    public static int divide(int a, int b) {
        return a / b; // This will throw ArithmeticException if b is 0
    }
}

