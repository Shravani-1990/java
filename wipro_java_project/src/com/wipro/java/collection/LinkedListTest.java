package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        // Using LinkedList
        LinkedList<Integer> ll = new LinkedList<>();
        int n = 5; // Example value for n

        // Adding elements to the LinkedList
        for (int i = 1; i <= n; i++) {
            ll.add(i);
        }

        // Printing elements
        System.out.println("Initial LinkedList: " + ll);

        // Remove element at index 3
        ll.remove(3); // index

        // Displaying the list after deletion
        System.out.println("After removing element at index 3: " + ll);

        // Printing elements one by one
        System.out.print("Elements one by one: ");
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
        System.out.println();
    }
}

