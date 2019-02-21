package com.techlab.testemployeedataanalyzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import com.techlab.employeedataanlayzer.Employee;

public class Employeehierarchy {
private HashMap<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
private ArrayList<Employee> employeeList = new ArrayList<>();
private Employee CEO;

public  Employeehierarchy(TreeSet<Employee> list) {
	employeeList.addAll(list);
	makeHeirarchy();
	getCEO();}


public void makeHeirarchy() {

	for (Employee e : employeeList) {
		if (!employeeMap.containsKey(e.getEmpId())) {
			employeeMap.put(e.getEmpId(), e);
		}
	}

	for (Employee e : employeeList) {
		String managerID = e.getManagerId();
		if (managerID.equals("NULL")) {
			managerID = "0";
		}
		if (employeeMap.containsKey(Integer.parseInt(managerID))) {
			employeeMap.get(Integer.parseInt(managerID)).addReportee(e);
		}
	}
}

public HashMap<Integer, Employee> getEmployeeMap() {
	return employeeMap;
}


public ArrayList<Employee> getEmployeeList() {
	return employeeList;
}


public void getCEO() {
	CEO = employeeMap.get(7839);
}

public Employee getHead() {
	return CEO;
}

public Map<Integer, Employee> getMap() {
	return employeeMap;
}

}