package com.techlab.testcollege;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.techlab.college.Branch;
import com.techlab.college.College;
import com.techlab.college.Professor;
import com.techlab.college.Student;

public class HtmlBuilder {

	public static void main(String[] args) throws IOException {
		Student s1 = new Student(1, "NY", "22-06-19", Branch.COMPUTER, "Joe");
		Student s2 = new Student(2, "US", "14-08-19", Branch.ELECTRICAL, "Jack");

		Professor p1 = new Professor(3, "China", "01-08-19", "Jose");
		Professor p2 = new Professor(4, "Indoneasia", "05-11-19", "Harry");

		College cl = new College("A.P.SHAH");
		cl.addStudent(s1);
		cl.addStudent(s2);
		cl.addProfessor(p1);
		cl.addProfessor(p2);

		htmlGenerator(cl);

	}

	public static void htmlGenerator(College college) throws IOException {
		String fileName = "C:\\Users\\gaurang\\Desktop\\college.html";
		FileWriter filewriter = new FileWriter(fileName, false);
		filewriter.append("<div><h1><strong>College name :" + college.getName() + "</b></h1><strong>" + "\t"
				+ "<div>No of Students in this college :" + college.getStudentCount() + "<br>" + "\t"
				+ "<div>No of Professos in this college :" + college.getProfessorCount() + "<br>");
		filewriter.append("<h2>Student Details</h2>");
		ArrayList<Student> studentList = college.getStudentList();
		for (Student student : studentList) {
			filewriter.append("<div> ID : " + student.getId() + "</div>" + "<div> Branch " + student.getBranch()
					+ "</div>" + "<div> Address : " + student.getAddress() + "</div>" + "<div> DOB : "
					+ student.getDate() + "</div>");
		}
		filewriter.append("<h2>Professor Details</h2>");
		ArrayList<Professor> professorList = college.getProfessorList();
		for (Professor professor : professorList) {
			filewriter.append("<div> ID : " + professor.getId() + "</div>" + "<div> Address : " + professor.getAddress()
					+ "</div>" + "<div> DOB : " + professor.getDate() + "</div>");
		}
		filewriter.close();
	}

}
