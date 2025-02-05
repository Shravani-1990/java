package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        // Initialize two lists
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        List<Integer> l2 = new ArrayList<>();
        l2.add(10);
        l2.add(20);

        System.out.println("Initial l1: " + l1);
        System.out.println("Initial l2: " + l2);

        // Add all elements from l2 into l1 starting at index 1
        l1.addAll(1, l2);
        System.out.println("After l1.addAll(1, l2): " + l1);

        // Remove the element at index 1
        l1.remove(1);
        System.out.println("After l1.remove(1): " + l1);

        // Set the element at index 0 to 5
        l1.set(0, 5);
        System.out.println("After l1.set(0, 5): " + l1);
    }
}

