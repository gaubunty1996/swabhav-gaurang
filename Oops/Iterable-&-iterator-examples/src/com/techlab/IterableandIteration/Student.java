package com.techlab.IterableandIteration;

public class Student {
	private int rolNumber;
	private String name;
	private int age;

	public Student(int rolNumber, String name, int age) {
		this.rolNumber = rolNumber;
		this.name = name;
		this.age = age;
	}

	public int getRolNumber() {
		return rolNumber;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "RolNumber = " + rolNumber + ", Name=" + name + ", Age=" + age;
	}
}
