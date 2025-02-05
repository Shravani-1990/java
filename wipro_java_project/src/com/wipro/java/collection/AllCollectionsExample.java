package com.wipro.java.collection;

import java.util.*;

public class AllCollectionsExample {

    public static void main(String[] args) {
        // 1. List Examples
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        List<String> linkedList = new LinkedList<>(arrayList);

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);

        // 2. Set Examples
        Set<String> hashSet = new HashSet<>(arrayList);
        Set<String> linkedHashSet = new LinkedHashSet<>(arrayList);
        Set<String> treeSet = new TreeSet<>(arrayList);

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);

        // 3. Queue Examples
        Queue<String> priorityQueue = new PriorityQueue<>(arrayList);
        Queue<String> linkedListQueue = new LinkedList<>(arrayList);

        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("LinkedList as Queue: " + linkedListQueue);

        // 4. Deque Example
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Apple");
        arrayDeque.addFirst("Banana");
        arrayDeque.addLast("Cherry");

        System.out.println("ArrayDeque: " + arrayDeque);

        // 5. Map Examples
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>(hashMap);
        Map<Integer, String> treeMap = new TreeMap<>(hashMap);

        System.out.println("HashMap: " + hashMap);
        System.out.println("LinkedHashMap: " + linkedHashMap);
        System.out.println("TreeMap: " + treeMap);

        // Iterating over a Map
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 6. Stack Example
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Stack: " + stack);
        System.out.println("Popped from Stack: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
