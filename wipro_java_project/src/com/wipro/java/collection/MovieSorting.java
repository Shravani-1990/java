package com.wipro.java.collection;

import java.util.*;

//Film class
class Film {
 private String name;
 private double rating;
 private int year;

 // Constructor
 public Film(String name, double rating, int year) {
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

 // Overriding toString() for easy output
 @Override
 public String toString() {
     return name + " (" + year + ") - Rating: " + rating;
 }
}

//Comparator to sort movies by name
class NameComparator implements Comparator<Movie> {
 @Override
 public int compare(Movie m1, Movie m2) {
     return m1.getName().compareTo(m2.getName()); // Alphabetical order
 }
}

//Comparator to sort movies by rating (descending)
class RatingComparator implements Comparator<Movie> {
 @Override
 public int compare(Movie m1, Movie m2) {
     return Double.compare(m2.getRating(), m1.getRating()); // Higher rating first
 }
}

//Comparator to sort movies by year (ascending)
class YearComparator implements Comparator<Movie> {
 @Override
 public int compare(Movie m1, Movie m2) {
     return Integer.compare(m1.getYear(), m2.getYear()); // Older movies first
 }
}

//Main class
public class MovieSorting {
 public static void main(String[] args) {
     List<Movie> movies = new ArrayList<>();
     movies.add(new Movie("Inception", 8.8, 2010));
     movies.add(new Movie("Interstellar", 8.6, 2014));
     movies.add(new Movie("The Dark Knight", 9.0, 2008));
     movies.add(new Movie("Tenet", 7.5, 2020));

     // Sorting by name
     Collections.sort(movies, new NameComparator());
     System.out.println("Movies sorted by name:");
     for (Movie m : movies) {
         System.out.println(m);
     }

     // Sorting by rating
     Collections.sort(movies, new RatingComparator());
     System.out.println("\nMovies sorted by rating:");
     for (Movie m : movies) {
         System.out.println(m);
     }

     // Sorting by year
     Collections.sort(movies, new YearComparator());
     System.out.println("\nMovies sorted by year:");
     for (Movie m : movies) {
         System.out.println(m);
     }
 }
}
