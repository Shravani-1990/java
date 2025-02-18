package com.wipro.java.linkedlist;

import java.sql.*;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/game_db";
    private static final String DB_USER = "root"; // Change as per your MySQL user
    private static final String DB_PASSWORD = ""; // Change as per your MySQL password

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        int targetNumber = random.nextInt(100) + 1; // Random number between 1-100
        int attempts = 0;
        int guess = -1;

        System.out.println("Guess the number between 1 and 100!");

        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        }

        int score = 100 - attempts; // Basic scoring logic (higher attempts = lower score)

        // Save game data to database
        saveScoreToDatabase(playerName, attempts, score);
        
        scanner.close();
    }

    private static void saveScoreToDatabase(String playerName, int attempts, int score) {
        try {
            // Establish connection
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            String sql = "INSERT INTO player_scores (player_name, attempts, score) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, playerName);
            pstmt.setInt(2, attempts);
            pstmt.setInt(3, score);
            
            // Execute update
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Your score has been saved to the database!");
            }
            
            // Close connection
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}

