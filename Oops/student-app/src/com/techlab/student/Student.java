package com.techlab.student;

public class Student {

	private String fname;
	private String lname;
	private double cgpa;
	private int rollno;
	static private int rollNoCount;

	public Student(String fname, String lname, double cgpa) {
		this.fname = fname;
		this.cgpa = cgpa;
		this.lname = lname;
		this.rollno = rollNoCount;
		rollNoCount = rollNoCount + 1;

	}

	static {
		rollNoCount = 1001;
		System.out.println("inside static block");

	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public double getCgpa() {
		return cgpa;
	}

	public int getCount() {

		return rollno;
	}

}
