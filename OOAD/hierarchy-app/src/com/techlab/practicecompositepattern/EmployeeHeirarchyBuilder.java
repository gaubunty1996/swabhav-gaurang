package com.techlab.practicecompositepattern;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmployeeHeirarchyBuilder {
	private Employee rootEmployee = null;
	private Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();

	public EmployeeHeirarchyBuilder(Set<Employee> empSet) {
		for (Employee employee : empSet) {
			empMap.put(employee.getEmpId(), employee);
		}
		getHeirachy();
	}

	public Employee getRoot() {
		for (Employee employee : empMap.values()) {
			if (employee.getMangerId() == null) {
				return rootEmployee = employee;
			}
		}
		return rootEmployee;
	}

	public Map<Integer, Employee> getEmpMap() {
		return empMap;
	}

	public void setEmpMap(Map<Integer, Employee> empMap) {
		this.empMap = empMap;
	}

	public void getHeirachy() {
		for (Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
			if (empMap.containsKey(entry.getValue().getMangerId())) {
				Employee employee = empMap.get(entry.getValue().getMangerId());
				employee.addRepotee(entry.getValue());
			}
		}
	}

}