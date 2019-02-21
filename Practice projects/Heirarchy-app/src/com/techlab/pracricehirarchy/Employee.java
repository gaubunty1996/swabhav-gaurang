package com.techlab.pracricehirarchy;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private Integer empId;
	private Integer mgrId;
	private String empName;
	private List<Employee> teamMembers = new ArrayList<Employee>();
	private static String compositeBuilder = " ";

	public void ls() {
		System.out.println(compositeBuilder + empName);
		String len = compositeBuilder;
		compositeBuilder=compositeBuilder +"   ";
		for (Employee e : teamMembers) {
			e.ls();
		}
		compositeBuilder = len;
	}

	public Employee(Integer empId, Integer mgrId, String empName) {
		super();
		this.empId = empId;
		this.mgrId = mgrId;
		this.empName = empName;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Integer getMgrId() {
		return mgrId;
	}

	public void setMgrId(Integer mgrId) {
		this.mgrId = mgrId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<Employee> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(List<Employee> teamMembers) {
		this.teamMembers = teamMembers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empId == null) ? 0 : empId.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((mgrId == null) ? 0 : mgrId.hashCode());
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
		if (empId == null) {
			if (other.empId != null)
				return false;
		} else if (!empId.equals(other.empId))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (mgrId == null) {
			if (other.mgrId != null)
				return false;
		} else if (!mgrId.equals(other.mgrId))
			return false;
		return true;
	}

}
