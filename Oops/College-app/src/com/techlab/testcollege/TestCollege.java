package com.techlab.testcollege;

import java.util.ArrayList;

import com.techlab.college.Branch;
import com.techlab.college.College;
import com.techlab.college.Person;
import com.techlab.college.Professor;
import com.techlab.college.Student;

public class TestCollege {

	public static void main(String[] args) {
		Student s1 = new Student(1, "NY", "22-06-19", Branch.COMPUTER, "Joe");
		Student s2 = new Student(2, "US", "14-08-19", Branch.ELECTRICAL, "Jack");

		Professor p1 = new Professor(3, "China", "01-08-19", "Jose");
		Professor p2 = new Professor(4, "Indoneasia", "05-11-19", "Harry");

		College cl = new College("A.P.SHAH");
		cl.addStudent(s1);
		cl.addStudent(s2);
		cl.addProfessor(p1);
		cl.addProfessor(p2);

		printDetails(cl);

	}

	public static void printDetails(College cl) {
		System.out.println("College name : " + cl.getName() + "\nIt has " + cl.getStudentCount() + " student");
		System.out.println("There details are as follows : ");
		ArrayList<Student> studentList = cl.getStudentList();
		for (Student student : studentList) {
			System.out.println("ID : " + student.getId() + " Branch " + student.getBranch() + " Address : "
					+ student.getAddress() + " DOB : " + student.getDate());
		}
		System.out.println("\n");
		System.out.println("Also it has " + cl.getProfessorCount() + " professors");
		System.out.println("There details are as follows : ");
		ArrayList<Professor> professorList = cl.getProfessorList();
		for (Professor professor : professorList) {
			System.out.println("ID : " + professor.getId() + " Name : " + professor.getName() + " Address : "
					+ professor.getAddress() + " Salary : " + professor.getSalary());
		}

	}

}
