package com.techlab.college;

import java.util.ArrayList;

public class College {
	private String name;
	private ArrayList<Student> studentList = new ArrayList<Student>();
	private ArrayList<Professor> professorList = new ArrayList<Professor>();
	
	public String getName() {
		return name;
	}

	public College(String name) {
		this.name=name;
	}

	public ArrayList<Student> addStudent(Student student) {
		studentList.add(student);
		return studentList;
	}

	public ArrayList<Professor> addProfessor(Professor professor) {
		professorList.add(professor);
		return professorList;

	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public ArrayList<Professor> getProfessorList() {
		return professorList;
	}

	public int getStudentCount() {
		return studentList.size();
	}

	public int getProfessorCount() {
		return professorList.size();
	}

}
