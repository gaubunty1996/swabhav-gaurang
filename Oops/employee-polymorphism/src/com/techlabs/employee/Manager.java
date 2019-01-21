package com.techlabs.employee;

public class Manager extends Employee {
	private double houseRentalAllowance;
	private double travelAllowance;
	private double salaryOfManager;
	private String role;

	public Manager(String employeeName, int employeeNumber, String role) {
		super(employeeName, employeeNumber);
		this.role = role;
		this.houseRentalAllowance = 0.6 * basic;
		this.travelAllowance = 0.6 * basic;
	}

	public double getHouseRentalAllowance() {
		return houseRentalAllowance;
	}

	public double getTravelAllowance() {
		return travelAllowance;
	}

	public double getSalary() {
		return salaryOfManager;
	}

	public String getRole() {
		return role;
	}

	@Override
	public void salary() {
		this.salaryOfManager = (basic + (this.houseRentalAllowance + this.travelAllowance));
	}

}
