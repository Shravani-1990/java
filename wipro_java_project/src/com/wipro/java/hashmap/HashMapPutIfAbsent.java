package com.wipro.java.hashmap;

import java.util.HashMap;

class HashMapPutIfAbsent {
  public static void main(String[] args){

    // create a HashMap
    HashMap<Integer, String> languages = new HashMap<>();

    // add mappings to HashMap
    languages.put(1, "Python");
    languages.put(2, "C");
    languages.put(3, "Java");
    System.out.println("Languages: " + languages);

    // key already not present in HashMap
    languages.putIfAbsent(4, "JavaScript");

    // key already present in HashMap
    languages.putIfAbsent(2, "Swift");
    System.out.println("Updated Languages: " + languages);
  }
}
