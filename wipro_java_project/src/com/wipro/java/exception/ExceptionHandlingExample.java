package com.wipro.java.exception;

import java.util.Scanner;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            
            // Attempting division
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling divide-by-zero exception
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            // Handling any other unexpected exceptions
            System.out.println("Error: Invalid input.");
        } finally {
            // Closing the scanner resource
            scanner.close();
            System.out.println("Program execution completed.");
        }
    }
}

