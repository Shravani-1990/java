package com.wipro.java.collection;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<Integer, String> map = new HashMap<>();

        // Put elements into the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Get an element from the map
        String value = map.get(2);
        System.out.println("Value for key 2: " + value);

        // Remove an element from the map
        map.remove(3);
        System.out.println("Removed key 3");

        // Iterate over the map entries
        System.out.println("Iterating over map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
