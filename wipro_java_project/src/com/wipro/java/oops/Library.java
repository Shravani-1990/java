package com.wipro.java.oops;

//Abstract class representing a generic library item
abstract class LibraryItem {
 private String title;
 private String author;
 private int id;
 
 // Constructor
 public LibraryItem(String title, String author, int id) {
     this.title = title;
     this.author = author;
     this.id = id;
 }
 
 // Getter and Setter methods (Encapsulation)
 public String getTitle() {
     return title;
 }
 
 public void setTitle(String title) {
     this.title = title;
 }
 
 public String getAuthor() {
     return author;
 }
 
 public void setAuthor(String author) {
     this.author = author;
 }
 
 public int getId() {
     return id;
 }
 
 public void setId(int id) {
     this.id = id;
 }

 // Abstract method that will be implemented by subclasses
 public abstract void displayInfo();
}

//Book class inheriting from LibraryItem
class Book extends LibraryItem {
 private int pages;
 
 // Constructor
 public Book(String title, String author, int id, int pages) {
     super(title, author, id); // Call the constructor of the parent class
     this.pages = pages;
 }

 // Getter and Setter for pages
 public int getPages() {
     return pages;
 }

 public void setPages(int pages) {
     this.pages = pages;
 }

 // Implement the abstract method
 @Override
 public void displayInfo() {
     System.out.println("Book ID: " + getId());
     System.out.println("Title: " + getTitle());
     System.out.println("Author: " + getAuthor());
     System.out.println("Pages: " + pages);
 }
}

//Magazine class inheriting from LibraryItem
class Magazine extends LibraryItem {
 private int issueNumber;
 
 // Constructor
 public Magazine(String title, String author, int id, int issueNumber) {
     super(title, author, id); // Call the constructor of the parent class
     this.issueNumber = issueNumber;
 }

 // Getter and Setter for issue number
 public int getIssueNumber() {
     return issueNumber;
 }

 public void setIssueNumber(int issueNumber) {
     this.issueNumber = issueNumber;
 }

 // Implement the abstract method
 @Override
 public void displayInfo() {
     System.out.println("Magazine ID: " + getId());
     System.out.println("Title: " + getTitle());
     System.out.println("Author: " + getAuthor());
     System.out.println("Issue Number: " + issueNumber);
 }
}

//Main class to demonstrate the use case
public class Library {
 public static void main(String[] args) {
     // Create objects of Book and Magazine
     LibraryItem book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 101, 180);
     LibraryItem magazine1 = new Magazine("National Geographic", "Various", 201, 120);
     
     // Polymorphism - Using parent reference to call child method
     book1.displayInfo();
     System.out.println(); // For better readability
     magazine1.displayInfo();
 }
}

