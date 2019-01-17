package com.techlabs.serialization;

public class Student implements java.io.Serializable {
	
	private String name;
	private int rollNo ;
	private double cgpa;
	
	public Student(String name,int rollNo,double cgpa) {
		this.cgpa=cgpa;
		this.name=name;
		this.rollNo=rollNo;
	}
	
	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public double getCgpa() {
		return cgpa;
	}

	

}
