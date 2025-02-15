package com.wipro.java.hashmap;

import java.util.HashMap;

class HashMapIsEmpty {
    public static void main(String[] args) {
        // create an HashMap
        HashMap<String, Integer> languages = new HashMap<>();
        System.out.println("Newly Created HashMap: " + languages);

        // checks if the HashMap has any element
        boolean result = languages.isEmpty(); // true
        System.out.println("Is the HashMap empty? " + result);

        // insert some elements to the HashMap
        languages.put("Python", 1);
        languages.put("Java", 14);
        System.out.println("Updated HashMap: " + languages);

        // checks if the HashMap is empty
        result = languages.isEmpty();  // false
        System.out.println("Is the HashMap empty? " + result);
    }
}
