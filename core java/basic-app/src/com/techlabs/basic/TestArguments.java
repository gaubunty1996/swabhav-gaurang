package com.techlabs.basic;

public class TestArguments {

	public static void main(String[] names) {
		if (names.length > 0) {

			for(String temp:names) {
				System.out.println("Hello " + temp);

			}
			System.out.println("Thanks");

		} else {
			System.out.println("invalid input more characters");
		}

	}

}
