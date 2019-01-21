package com.techlabs.employee;

public class Developer extends Employee {
	//private double performanceAllowance;
	//private String role;
	//private double salaryOfDeveloper;

	public Developer(String employeeName, int employeeNumber, String role) {
		super(employeeName, employeeNumber);
		this.role = role;
		this.performanceAllowance = 0.4 * basic;
	}

	public double getPerformanceAllowance() {
		return performanceAllowance;
	}

	public String getRole() {
		return role;
	}

	@Override
	public void salary() {
		this.salary = (basic + (this.performanceAllowance));
	}

}
