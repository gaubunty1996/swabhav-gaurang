package com.techlab.employeedataanlayzer;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class DataAnalyzer {
	Parser parser;

	public Map<String, Integer> CountOfEmployeeByDesignation(TreeSet<Employee> treeset) {
		Map<String, Integer> map = new TreeMap<String, Integer>();
		for (Employee empolyee : treeset) {
			if (map.get(empolyee.getDesignation()) == null) {
				map.put(empolyee.getDesignation(), 1);
			} else {
				int counter = map.get(empolyee.getDesignation());
				counter++;
				map.put(empolyee.getDesignation(), counter);

			}
		}
		return map;
	}

	public Map<Integer, Integer> CountOfEmployeeByDepartmentNumber(TreeSet<Employee> treeset) {
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (Employee empolyee : treeset) {
			if (map.get(empolyee.getDepartmentNumber()) == null) {
				map.put(empolyee.getDepartmentNumber(), 1);
			} else {
				int counter = map.get(empolyee.getDepartmentNumber());
				counter++;
				map.put(empolyee.getDepartmentNumber(), counter);

			}
		}
		return map;
	}

	public String maximumSalarisedEmployees(ArrayList<Employee> list) throws Exception {
		ArrayList<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee.addAll(list);
		int lastEmployee = listOfEmployee.size() - 1;
		return listOfEmployee.get(lastEmployee).getEmpId() + " " + listOfEmployee.get(lastEmployee).getName() + " "
				+ listOfEmployee.get(lastEmployee).getDesignation() + " "
				+ listOfEmployee.get(lastEmployee).getSalary();
	}

	public int totalNumberOfEmployee(TreeSet<Employee> listOfEmployee) throws Exception {
		return listOfEmployee.size();
	}

}
