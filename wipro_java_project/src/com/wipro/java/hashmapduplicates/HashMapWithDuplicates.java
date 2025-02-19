package com.wipro.java.hashmapduplicates;


import java.util.*;

class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNumber=" + rollNumber + "}";
    }
}

public class HashMapWithDuplicates {
    public static void main(String[] args) {
        Map<String, List<Student>> studentMap = new HashMap<>();

        // Sample student data with duplicate names and roll numbers
        Student[] students = {
            new Student("Alice", 101),
            new Student("Bob", 102),
            new Student("Alice", 101), // Duplicate entry
            new Student("Charlie", 103),
            new Student("David", 104),
            new Student("Eve", 105),
            new Student("Frank", 106),
            new Student("Alice", 107), // Same name, different roll number
            new Student("Bob", 102),   // Duplicate entry
            new Student("George", 108)
        };

        // Inserting students into the HashMap
        for (Student student : students) {
            studentMap.putIfAbsent(student.name, new ArrayList<>());
            studentMap.get(student.name).add(student);
        }

        // Displaying the HashMap
        for (Map.Entry<String, List<Student>> entry : studentMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}


