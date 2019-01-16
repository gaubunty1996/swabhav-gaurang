package com.techlabs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

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

	public String getName() {
		return firstName;
	}

	public void setName(String newFirstName) {
		firstName = newFirstName;
	}

	public void showMethods(Method[] method) {
		System.out.println("Name of methods are: ");
		for (int i = 0; i < method.length; i++) {
			System.out.println(method[i]);
		}

	}

	public int countNumbersOfGetters(Method[] method) {
		int countOfGetMethod = 0;
		for (int i = 0; i < method.length; i++) {
			if (method[i].getName().startsWith("get")) {
				countOfGetMethod = countOfGetMethod + 1;
			}
		}
		return countOfGetMethod;
	}

	public int countNumbersOfSetters(Method[] method) {
		int countOfSetMethod = 0;
		for (int i = 0; i < method.length; i++) {
			if (method[i].getName().startsWith("set")) {
				countOfSetMethod = countOfSetMethod + 1;
			}
		}
		return countOfSetMethod;
	}

	public int countOfConstructors(Constructor[] constructor) {
		int constructorCount = 0;
		return constructor.length;
	}

	public int countOfMethods(Method[] method) {
		return method.length;
	}

	public void namesOfConstructors(Constructor[] constructor) {
		for (int i = 0; i < constructor.length; i++) {
			System.out.println(constructor[i].getName());
		}
	}

	public String nameOfConstructor(Constructor constructor) {
		return constructor.getName();
	}

	public void nameOfClass(Class name) {
		System.out.println("Name of class is: " + name.getName());
	}

	public void nameOfGetters(Method[] method) {

		for (int i = 0; i < method.length; i++) {
			if (method[i].getName().startsWith("get")) {
				System.out.println("one of the getter method name is:  " + method[i].getName());
			}
		}
	}

	public void nameOfSetters(Method[] method) {

		for (int i = 0; i < method.length; i++) {
			if (method[i].getName().startsWith("set")) {
				System.out.println("one of the setter method name is: " + method[i].getName());
			}
		}
	}
}
