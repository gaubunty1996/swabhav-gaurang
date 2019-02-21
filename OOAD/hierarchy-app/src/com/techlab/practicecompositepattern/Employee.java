package com.techlab.practicecompositepattern;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee> {
	private Integer empId;
	private Integer mangerId;
	private String name;
	private String designation;
	private StringBuffer parallel=new StringBuffer();
	private static String compositeBuilder = " ";
	private List<Employee> reportee = new ArrayList<Employee>();

	public Employee(Integer empId, Integer mangerId, String name, String designation) {
		this.empId = empId;
		this.mangerId = mangerId;
		this.name = name;
		this.designation = designation;
	}
	public void display() {
		System.out.println(compositeBuilder + name);
		String len = compositeBuilder;
		compositeBuilder=compositeBuilder +"   ";
		for (Employee e : reportee) {
			e.display();
		}
		compositeBuilder = len;
	}
	public StringBuffer displayDetails() {
		parallel.append("<Employee");
		parallel.append(" name=\""+name+"\" id=\""+empId+"\" designation=\""+designation+"\">");
		for(Employee employee:reportee) {
			parallel.append("<Reportee>");
			parallel.append(" "+employee.displayDetails());
			parallel.append("</Reportee>");
		}
		parallel.append("</Employee>");
		return parallel;
	}

	public Integer getEmpId() {
		return empId;
	}

	public Integer getMangerId() {
		return mangerId;
	}


	public String getDesignation() {
		return designation;
	}

	public void addRepotee(Employee employee) {
		reportee.add(employee);
	}

	public String getName() {
		return name;
	}

	public List<Employee> getReportee() {
		return reportee;
	}

	@Override
	public int compareTo(Employee o) {
		return this.empId - o.empId;
	}

}