package com.techlab.testhashset;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.techlabs.hashset.Student;

public class TestTreeSet {

	public static void main(String[] args) {
		Set<Student> students;
		students = new TreeSet<Student>(new NameCompare());
		Student student1 = new Student("Sachin", "Tendulkar", 101);
		students.add(student1);
		Student student2 = new Student("airat", "Tendulkar", 105);
		students.add(student2);
		System.out.println(students.size());
		
		for (Student student : students) {
			System.out.println("Name: " + student.getFirstName() + "Last name: " + student.getLastName()
					+ "Roll number: " + student.getRollNumber());
		}

		Set<Student> studentByRollNumber;
		studentByRollNumber = new TreeSet<Student>(new RollCompare());
		Student student1RollNumber = new Student("Sachin", "Tendulkar", 101);
		studentByRollNumber.add(student1RollNumber);
		Student student2RollNumber = new Student("Virat", "Tendulkar", 105);
		studentByRollNumber.add(student2RollNumber);
		System.out.println(students.size());
		System.out.println(students);
		for (Student student : studentByRollNumber) {
			System.out.println("Name: " + student.getFirstName() + "Last name: " + student.getLastName()
					+ "Roll number: " + student.getRollNumber());
		}

		Set<Student> studentByLastName;
		studentByLastName = new TreeSet<Student>(new RollCompare());
		Student studentlastName1 = new Student("Sachin", "a", 101);
		studentByLastName.add(studentlastName1);
		Student studentlastName2 = new Student("Virat", "b", 105);
		studentByLastName.add(studentlastName2);
		System.out.println(studentByLastName.size());
		System.out.println(studentByLastName);
		for (Student student : studentByLastName) {
			System.out.println("Name: " + student.getFirstName() + "Last name: " + student.getLastName()
					+ "Roll number: " + student.getRollNumber());
		}
	}

}
