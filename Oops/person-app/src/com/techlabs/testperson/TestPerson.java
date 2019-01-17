package com.techlabs.testperson;

import com.techlab.person.GenderOptions;
import com.techlab.person.Person;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(22, "Gaurang", 1.65, 100, GenderOptions.MALE);
		System.out.println("Gaurang's BMI is: " + p1.bmiScore() + " falls under " + p1.bmiCategory());
		System.out.println(p1.getHeight());
		System.out.println(p1.getWeight());
		p1.eat();
		p1.workout();
		System.out.println(p1.getHeight());
		System.out.println(p1.getWeight());
		System.out.println("Gaurang's BMI is: " + p1.bmiScore() + " falls under " + p1.bmiCategory());
		Person p2 = new Person(22, "xyz", 5, 55.00, GenderOptions.MALE);
		System.out.println("xyz's BMI is: " + p2.bmiScore() + " falls under " + p2.bmiCategory());
	}

}
