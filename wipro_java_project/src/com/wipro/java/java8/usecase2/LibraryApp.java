package com.wipro.java.java8.usecase2;

import java.util.*;
import java.util.stream.Collectors;

// Abstract class demonstrating Abstraction
abstract class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }

    public abstract String getCategory();

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: $" + price + ", Category: " + getCategory();
    }
}

// Subclass demonstrating Inheritance
class FictionBook extends Book {
    public FictionBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public String getCategory() {
        return "Fiction";
    }
}

// Another subclass demonstrating Inheritance
class NonFictionBook extends Book {
    public NonFictionBook(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public String getCategory() {
        return "Non-Fiction";
    }
}

// Library class demonstrating Collections
class Library {
    private List<Book> books = new ArrayList<>();
    private Set<String> uniqueAuthors = new HashSet<>();
    private Map<String, List<Book>> booksByCategory = new HashMap<>();

    // Add book and update collections
    public void addBook(Book book) {
        books.add(book);
        uniqueAuthors.add(book.getAuthor());
        booksByCategory.computeIfAbsent(book.getCategory(), k -> new ArrayList<>()).add(book);
    }

    // Display books using Streams
    public void displayBooks() {
        books.forEach(System.out::println);
    }

    // Get unique authors
    public void displayUniqueAuthors() {
        System.out.println("Unique Authors: " + uniqueAuthors);
    }

    // Get books by category
    public void displayBooksByCategory() {
        booksByCategory.forEach((category, bookList) -> {
            System.out.println("Category: " + category);
            bookList.forEach(System.out::println);
        });
    }

    // Get books with price filter using Streams
    public List<Book> getBooksCheaperThan(double price) {
        return books.stream()
                .filter(book -> book.getPrice() < price)
                .collect(Collectors.toList());
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addBook(new FictionBook("The Hobbit", "J.R.R. Tolkien", 15.99));
        library.addBook(new FictionBook("Harry Potter", "J.K. Rowling", 12.50));
        library.addBook(new NonFictionBook("Sapiens", "Yuval Noah Harari", 20.00));
        library.addBook(new NonFictionBook("Educated", "Tara Westover", 18.00));

        // Display books
        System.out.println("All Books:");
        library.displayBooks();

        // Display unique authors
        System.out.println("\nUnique Authors:");
        library.displayUniqueAuthors();

        // Display books by category
        System.out.println("\nBooks by Category:");
        library.displayBooksByCategory();

        // Find and display books cheaper than $18
        System.out.println("\nBooks Cheaper than $18:");
        library.getBooksCheaperThan(18).forEach(System.out::println);
    }
}

