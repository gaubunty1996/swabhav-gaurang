package com.techlabs.employee;

public class Accountant extends Employee {
	//private double perks;
	//private String role;
	//private double salaryOfAccountant;

	public Accountant(String employeeName, int employeeNumber, String role) {
		super(employeeName, employeeNumber);
		this.role = role;
		this.perks = 0.3 * basic;
	}

	public double getPerks() {
		return perks;
	}

	public String getRole() {
		return role;
	}

	@Override
	public void salary() {
		this.salary = (basic + (this.perks));
	}

}
