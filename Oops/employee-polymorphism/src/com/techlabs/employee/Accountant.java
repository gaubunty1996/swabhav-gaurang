package com.techlabs.employee;

public class Accountant extends Employee {
	private double perks;
	private String role;
	private double salaryOfAccountant;

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

	public double getSalary() {
		return salaryOfAccountant;
	}

	@Override
	public void salary() {
		this.salaryOfAccountant = (basic + (this.perks));
	}

}
