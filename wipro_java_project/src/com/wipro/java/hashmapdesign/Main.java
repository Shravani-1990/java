package com.wipro.java.hashmapdesign;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        
        System.out.println("Value of 'banana': " + map.get("banana")); // Output: 2
        
        map.remove("banana");
        System.out.println("Value of 'banana' after removal: " + map.get("banana")); // Output: null
        
        map.print(); // Print entire hashmap
    }
}

