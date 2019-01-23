package com.techlab.college;

public class Professor extends Person implements SalariedEmployee {
	
	private double salary;
	
	public Professor(int id,String address,String dob,String name) {
		super(id,address,dob,name);
		this.salary=baseSalary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public double calulateSalary() {
		this.salary=baseSalary+(baseSalary*0.3);
		return salary;
	}
}
