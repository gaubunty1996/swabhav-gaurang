package com.techlabs.employee;

public abstract class Employee {
	
	protected int employeeNumber;
	protected String employeeName;
	protected int basic;
	protected double salary;
	protected double perks;
	protected String role;
	protected double performanceAllowance;
	protected double houseRentalAllowance;
	protected double travelAllowance;
	
	
	public Employee(String employeeName,int employeeNumber) {
		this.employeeName=employeeName;
		this.employeeNumber=employeeNumber;
		this.basic=50000;
	}
	public double getPerks() {
		return perks;
	}
	public String getRole() {
		return role;
	}
	public double getPerformanceAllowance() {
		return performanceAllowance;
	}
	public double getHouseRentalAllowance() {
		return houseRentalAllowance;
	}
	public double getTravelAllowance() {
		return travelAllowance;
	}
	
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public double getSalary() {
		return salary;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public int getBasic() {
		return basic;
	}
	public abstract void salary();
}
