package com.wipro.java.hashmap;

import java.util.HashMap;

class HashMapReinitialize {
    public static void main(String[] args) {

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap: " + numbers);

        // reinitialize the hashmap
        numbers = new HashMap<>();
        System.out.println("New HashMap: " + numbers);
    }
}