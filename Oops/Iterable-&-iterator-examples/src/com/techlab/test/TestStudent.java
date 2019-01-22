package com.techlab.test;
import java.util.ArrayList;
import java.util.Iterator;

import com.techlab.IterableandIteration.Student;

public class TestStudent {

	public static void main(String[] args) {
		ArrayList<Student> listOfStudent = new ArrayList<>();

		Student student = new Student(21, "Gaurang", 22);
		Student student2 = new Student(95, "Jaaie", 18);
		Student student3 = new Student(18, "Soham", 22);

		listOfStudent.add(student);
		listOfStudent.add(student2);
		listOfStudent.add(student3);
		
		for (Student stud : listOfStudent) {
			System.out.println("Roll Number : "+stud.getRolNumber()+", Name : "+stud.getName()+", Age : "+stud.getAge());
		}

		System.out.println("\n");
		Iterator iterator = listOfStudent.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
}
	}

}
