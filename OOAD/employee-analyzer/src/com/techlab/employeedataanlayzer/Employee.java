package com.techlab.employeedataanlayzer;

import java.util.ArrayList;
import java.util.Date;

public class Employee implements Comparable<Employee> {
	private String name;
	private String designation;
	private int empId;
	private String managerId;
	private String commission;
	private String dateOfJoining;
	private int departmentNumber;
	private int salary;
	private ArrayList<Employee> reporteeList;
	
	public Employee() {
		super();
		reporteeList = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerID) {
		this.managerId = managerID;
	}

	public String getCommission() {
		return commission;
	}

	public void setCommission(String commission) {
		this.commission = commission;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		return this.empId - o.empId;

	}
	public ArrayList<Employee> getReporteeList() {
		return reporteeList;
	}
	
	public StringBuilder getReportee(){
		StringBuilder data=new StringBuilder();
		for(Employee employee:getReporteeList()) {
			data.append(employee.getDesignation()+" "+employee.getName()+"|");
		}
		return data;
	}

	public void setReporteeList(ArrayList<Employee> reporteeList) {
		this.reporteeList = reporteeList;
	}

	public void addReportee(Employee employee) {
		reporteeList.add(employee);
}

}
