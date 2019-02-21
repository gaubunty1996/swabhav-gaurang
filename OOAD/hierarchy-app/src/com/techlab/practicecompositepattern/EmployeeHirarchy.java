package com.techlab.practicecompositepattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeHirarchy {
	private Employee rootEmployee = null;
	private List<Employee> reporteeList = new ArrayList<Employee>();
	private List<Employee> mangerList = new ArrayList<Employee>();
	private Set<Employee> empSet = new TreeSet<Employee>();

	public EmployeeHirarchy(Set<Employee> empSet) {
		this.empSet = empSet;
		findCEO();
		getManger();
		getRepotee();
	}

	public void findCEO() {
		for (Employee emp : empSet) {
			if (emp.getMangerId() == null) {
				rootEmployee = emp;
			} else {
				reporteeList.add(emp);
			}
		}
	}

	public void getManger() {
		for (Employee emp : reporteeList) {
			if (rootEmployee.getEmpId().equals(emp.getMangerId())) {
				rootEmployee.addRepotee(emp);
				mangerList.add(emp);
			}
		}
	}

	public void getRepotee() {
		for (Employee manger : mangerList) {
			for (Employee employee : reporteeList) {
				if (manger.getEmpId().equals(employee.getMangerId())) {
					manger.addRepotee(employee);
				}
			}
		}
	}

	public Employee getRootEmployee() {
		return rootEmployee;
	}

	public List<Employee> getReporteeList() {
		return reporteeList;
	}

	public List<Employee> getMangerList() {
		return mangerList;
	}

}