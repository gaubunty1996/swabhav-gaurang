package com.techlab.testhashset;

import java.util.HashSet;
import java.util.Set;

import com.techlabs.hashset.Student;

public class TestHashSet {

	public static void main(String[] args) {
		Set<Student> students;
		students = new HashSet<Student>();
		Student student1 = new Student("Sachin", "Tendulkar", 101);
		students.add(student1);
		Student student2 = new Student("Sachin", "Tendulkar", 101);
		//student1.validateCondition(student2, students);
		students.add(student2);
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(students.size());
	}

}
