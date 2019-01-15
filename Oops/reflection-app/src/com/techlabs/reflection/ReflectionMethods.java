package com.techlabs.reflection;

public class ReflectionMethods {

	private String firstName;
	private int rollNumber = 1;

	public ReflectionMethods() {
		firstName = "Gaurang";
	}

	public void addMiddleName(String middleName) {
		firstName = firstName + " " + middleName;
	}

	public void addLastName(String LastName) {
		firstName = firstName + " " + LastName;
	}

	public void show() {
		System.out.println(firstName);
	}

}
