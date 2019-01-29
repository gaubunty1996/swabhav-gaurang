package com.techlab.employeedataanlayzer;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class DataAnalyzer {
	Parser parser;
	static Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
	static Map<String, Integer> map1 = new TreeMap<String, Integer>();

	public Map<String, Integer> CountOfEmployeeByDesignation(TreeSet<Employee> treeset) {
		Map<String, Integer> map1 = new TreeMap<String, Integer>();
		for (Employee empolyee : treeset) {
			setDesignation(empolyee);
		}
		return DataAnalyzer.map1;
	}

	public Map<Integer, Integer> CountOfEmployeeByDepartmentNumber(TreeSet<Employee> treeset) {

		for (Employee empolyee : treeset) {
			setDepartment(empolyee);
		}
		return map;
	}

	public static void setDesignation(Employee employee) {
		if (map1.get(employee.getDesignation()) == null) {
			map1.put(employee.getDesignation(), 1);
		} else {
			int counter = map1.get(employee.getDesignation());
			counter++;
			map1.put(employee.getDesignation(), counter);

		}
	}

	public static void setDepartment(Employee employee) {
		if (map.get(employee.getDepartmentNumber()) == null) {
			map.put(employee.getDepartmentNumber(), 1);
		} else {
			int counter = map.get(employee.getDepartmentNumber());
			counter++;
			map.put(employee.getDepartmentNumber(), counter);

		}
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
