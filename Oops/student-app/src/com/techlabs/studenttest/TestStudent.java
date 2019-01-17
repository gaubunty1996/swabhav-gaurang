package com.techlabs.studenttest;

import com.techlab.student.Student;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("Gaurang", "Kadam", 5.88);
		System.out.println(s1.getCount());

		Student s2 = new Student("pablo", "esco", 7.00);
		System.out.println(s2.getCount());

		Student s3 = new Student("pablos", "escos", 7.03);
		System.out.println(s3.getCount());

		System.out.println(s1.getCount());

	}

}
