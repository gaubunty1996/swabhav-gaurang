package com.techlab.college;

public class Student extends Person {

	private int id;
	private String dob;
	private String address;
	private Branch branch;

	public Student(int id, String address, String dob,Branch branch,String name) {
		super(id, address, dob,name);
		this.branch=branch;
	}
	public Branch getBranch() {
		return branch;
	}
	
}
