package com.wipro.java.usecase2;

import java.util.*;

public class TreeMapToHashMap {
    public static void main(String[] args) {
        // Creating a TreeMap and adding some data
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Apple");
        treeMap.put(1, "Orange");
        treeMap.put(2, "Banana");
        treeMap.put(5, "Grapes");
        treeMap.put(4, "Mango");

        // Display the TreeMap (sorted order)
        System.out.println("TreeMap (Sorted): " + treeMap);
        
        // Creating a HashMap and copying data from TreeMap
        HashMap<Integer, String> hashMap = new HashMap<>(treeMap);
        
        // Display the HashMap (unordered)
        System.out.println("HashMap (Unordered): " + hashMap);
    }
}
