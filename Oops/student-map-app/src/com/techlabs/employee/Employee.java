package com.techlabs.employee;

public class Employee implements Comparable<Employee> {
	private int departNumber;
	private String fName;
	private String lName;
	private double salary;
	private int employeeNumber;

	public Employee(int departNumber, String fName, String lName, double salary, int employeeNumber) {
		this.departNumber = departNumber;
		this.employeeNumber = employeeNumber;
		this.fName = fName;
		this.lName = lName;
		this.salary = salary;
	}

	public int getDepartNumber() {
		return departNumber;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + departNumber;
		result = prime * result + employeeNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (departNumber != other.departNumber)
			return false;
		if (employeeNumber != other.employeeNumber)
			return false;
		return true;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	@Override
	public int compareTo(Employee employee) {
		if (this.getEmployeeNumber() > employee.getEmployeeNumber()) {
			return 1;
		}
		else if(this.getEmployeeNumber() < employee.getEmployeeNumber()){
			return -1;
		}
		return 0;
	}

}
