package com.wipro.java.hashmap;

import java.util.HashMap;

class HashMapPut {
  public static void main(String[] args) {
    // create an HashMap
    HashMap<String, Integer> languages = new HashMap<>();

    // insert items to the HashMap
    languages.put("Java", 14);
    languages.put("Python", 3);
    languages.put("JavaScript", 1);

    // display the HashMap
    System.out.println("Programming Languages: " + languages);
    }
}
