package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

// Movie class implementing Comparable
class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    // Constructor
    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    // Overriding compareTo method to sort movies by year
    @Override
    public int compareTo(Movie otherMovie) {
        return this.year - otherMovie.year; // Ascending order
    }

    // Overriding toString() for better output display
    @Override
    public String toString() {
        return name + " (" + year + ") - Rating: " + rating;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("Interstellar", 8.6, 2014));
        movies.add(new Movie("The Dark Knight", 9.0, 2008));
        movies.add(new Movie("Tenet", 7.5, 2020));

        // Sorting movies using Comparable
        Collections.sort(movies);

        // Display sorted movies
        System.out.println("Movies sorted by year:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}

