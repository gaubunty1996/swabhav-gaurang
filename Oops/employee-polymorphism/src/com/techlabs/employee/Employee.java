package com.techlabs.employee;

public abstract class Employee {
	
	protected int employeeNumber;
	protected String employeeName;
	protected int basic;
	
	public Employee(String employeeName,int employeeNumber) {
		this.employeeName=employeeName;
		this.employeeNumber=employeeNumber;
		this.basic=50000;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public int getBasic() {
		return basic;
	}
	public abstract void salary();
}
