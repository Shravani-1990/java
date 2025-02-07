package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        // Sorting a List
        List<Integer> numbers1 = Arrays.asList(5, 2, 8, 1, 3);
        List<Integer> sortedNumbers = numbers1.stream()
            .sorted()
            .collect(Collectors.toList());

        // Printing sorted list using for-each loop
        System.out.print("Sorted List: ");
        for (int num : sortedNumbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line

        // Finding Min and Max in another List
        List<Integer> numbers2 = Arrays.asList(10, 20, 5, 25, 30);
        Optional<Integer> minOpt = numbers2.stream().min(Integer::compare);
        Optional<Integer> maxOpt = numbers2.stream().max(Integer::compare);

        if (minOpt.isPresent() && maxOpt.isPresent()) {
            int min = minOpt.get();
            int max = maxOpt.get();

            // Printing min and max using for-each loop (single element lists)
            System.out.print("Minimum Value: ");
            for (int num : Arrays.asList(min)) {
                System.out.println(num);
            }

            System.out.print("Maximum Value: ");
            for (int num : Arrays.asList(max)) {
                System.out.println(num);
            }
        } else {
            System.out.println("List is empty, cannot determine min and max.");
        }
    }
}
