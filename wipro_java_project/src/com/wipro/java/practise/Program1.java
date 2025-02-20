package com.wipro.java.practise;

import java.util.LinkedList;
import java.util.Scanner;

// Generic Stack Implementation using Linked List
class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Push method
    public void push(T item) {
        list.addFirst(item);
    }

    // Pop method
    public T pop() {
        if (list.isEmpty()) {
            return null;
        }
        return list.removeFirst();
    }

    // Peek method
    public T peek() {
        if (list.isEmpty()) {
            return null;
        }
        return list.getFirst();
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }
}

public class Program1 {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        // Reading integer inputs
        while (scanner.hasNextInt()) {
            int userInput = scanner.nextInt();
            integerStack.push(userInput);
        }

        // Integer Stack Operations
        System.out.println("Peek: " + integerStack.peek());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Is Empty: " + integerStack.isEmpty());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Is Empty: " + integerStack.isEmpty());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Pop: " + integerStack.pop());
        System.out.println("Is Empty: " + integerStack.isEmpty());

        // Moving to String Stack
        Stack<String> stringStack = new Stack<>();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter strings to push onto the stack (enter an empty string to stop):");

        // Reading string inputs
        while (scanner.hasNextLine()) {
            String userInput = scanner.nextLine();
            if (userInput.isEmpty()) {
                break;
            }
            stringStack.push(userInput);
        }

        // String Stack Operations
        System.out.println("Peek: " + stringStack.peek());

        scanner.close();
    }
}