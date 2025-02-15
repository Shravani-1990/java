package com.wipro.java.hashmap;

import java.util.HashMap;

class HashMapSize {
    public static void main(String[] args) {
        // create an HashMap
        HashMap<String, String> countries = new HashMap<>();

        // insert keys/values to the HashMap
        countries.put("USA", "Washington");
        countries.put("UK", "London");
        countries.put("Canada", "Ottawa");
        System.out.println("HashMap: " + countries);

        // get the number of keys/values from HashMap
        int size = countries.size();
        System.out.println("Size of HashMap: " + size);
    }
}