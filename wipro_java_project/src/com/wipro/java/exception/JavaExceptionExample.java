package com.wipro.java.exception;

public class JavaExceptionExample {
	// it is accesible by all the instances of a class
	static int i=2;

	public static void main(String[] args) {
		int i=50, j=0, data;
		try {
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index");
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("I am executed");
		}
		System.out.println("rest of the code");

	}

}
