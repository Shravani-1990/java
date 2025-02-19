package com.wipro.java.linkedinuser;


import java.util.*;

//User class representing a LinkedIn user
class User {
 private String name;
 private String jobTitle;
 private String company;
 private String location;

 public User(String name, String jobTitle, String company, String location) {
     this.name = name;
     this.jobTitle = jobTitle;
     this.company = company;
     this.location = location;
 }

 @Override
 public String toString() {
     return "User{name='" + name + "', jobTitle='" + jobTitle + "', company='" + company + "', location='" + location + "'}";
 }
}

public class LinkedInUserList {
 public static void main(String[] args) {
     List<User> userList = new LinkedList<>();

     // Adding sample users
     userList.add(new User("Alice Johnson", "Software Engineer", "Google", "New York"));
     userList.add(new User("Bob Smith", "Data Scientist", "Microsoft", "Seattle"));
     userList.add(new User("Charlie Brown", "Product Manager", "Amazon", "San Francisco"));
     userList.add(new User("David White", "UX Designer", "Facebook", "Los Angeles"));
     userList.add(new User("Eve Black", "Marketing Manager", "LinkedIn", "Chicago"));

     // Displaying all users
     System.out.println("LinkedIn User List:");
     for (User user : userList) {
         System.out.println(user);
     }
 }
}


