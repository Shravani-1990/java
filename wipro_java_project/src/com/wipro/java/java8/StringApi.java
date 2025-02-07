package com.wipro.java.java8;

public class StringApi {

	public StringApi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Name xyz";
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.substring(1,3));
		System.out.println(str.contains("a"));
		String[] a=str.split(" ");
		for(String str1:a) {
			System.out.println(str1);
		}

	}

}
