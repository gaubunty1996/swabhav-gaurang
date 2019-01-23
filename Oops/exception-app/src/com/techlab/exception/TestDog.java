package com.techlab.exception;

public class TestDog {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println("value of c: " + c);
			// TestDog.main(args);
		} catch (ArrayIndexOutOfBoundsException array) {
			System.out.println("pass arguments through the method");
			System.out.println(array.getMessage());
		} catch (NumberFormatException num) {
			System.out.println("only integers allowed");
			System.out.println(num.getMessage());
		} catch (ArithmeticException arithmatic) {
			System.out.println("cannot divide by zero");
			System.out.println(arithmatic.getMessage());
		}
		System.out.println("Thank you");

	}

}
