package com.wipro.java.java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
    public static void main(String[] args) {
        // Get the current date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date: " + today);

        // Create a specific date (YYYY-MM-DD)
        LocalDate specificDate = LocalDate.of(2024, 12, 25);
        System.out.println("Specific Date: " + specificDate);

        // Add and subtract days, months, and years
        LocalDate nextWeek = today.plusDays(7);
        LocalDate lastMonth = today.minusMonths(1);
        LocalDate nextYear = today.plusYears(1);

        System.out.println("7 Days Later: " + nextWeek);
        System.out.println("1 Month Ago: " + lastMonth);
        System.out.println("Next Year: " + nextYear);

        // Compare two dates
        if (today.isBefore(specificDate)) {
            System.out.println(today + " is before " + specificDate);
        } else if (today.isAfter(specificDate)) {
            System.out.println(today + " is after " + specificDate);
        } else {
            System.out.println("Both dates are the same.");
        }

        // Format a date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);

        // Parse a date from a string
        String dateString = "15-08-2025";
        LocalDate parsedDate = LocalDate.parse(dateString, formatter);
        System.out.println("Parsed Date: " + parsedDate);
    }
}

