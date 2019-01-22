package com.techlab.testcompare;

import com.techlab.compare.CompareTheAge;
import java.util.ArrayList;
import java.util.Collections;

import com.techlab.compare.CompareTheAge;
import com.techlab.compare.Student;

public class TestStudent {

	public static void main(String[] args) {
		ArrayList<Student> listOfStudent = new ArrayList<>();

		Student student = new Student(21, "Gaurang", 28);
		Student student2 = new Student(18, "Soham", 22);

		System.out.println("Comparable example ==> using compareTo() by roll number :\n");
		listOfStudent.add(student);
		listOfStudent.add(student2);
		Collections.sort(listOfStudent);
		print(listOfStudent);

		System.out.println("\n");
		System.out.println("Comparator example ==> using compare() by age :\n");
		CompareTheAge ageCompare = new CompareTheAge();
		Collections.sort(listOfStudent, ageCompare);
		print(listOfStudent);
	}

	private static void print(ArrayList<Student> list) {
		System.out.println("Roll No. Name\t\tAge");
		for (Student stud : list) {
			System.out.println(stud.getRollNumber() + " \t " + stud.getName() + " \t" + stud.getAge());
		}
	}
}
