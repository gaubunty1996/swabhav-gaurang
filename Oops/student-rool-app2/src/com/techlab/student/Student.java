package com.techlab.student;

public class Student {

	private String fname;
	private String lname;
	private double cgpa;
	static private int count;

	public Student(String fname, String lname, double cgpa) {
		this.fname = fname;
		this.cgpa = cgpa;
		this.lname = lname;
		this.count = count + 1;
		System.out.println("inside constructor block");

	}

	static {
		count = 0;
		System.out.println("inside static block");

	}

	public static int headCount() {
		return count;
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

		return count;
	}

}
