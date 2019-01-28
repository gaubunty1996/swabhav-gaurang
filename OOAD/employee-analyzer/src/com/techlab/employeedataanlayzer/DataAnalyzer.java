package com.techlab.employeedataanlayzer;

import java.util.ArrayList;
import java.util.TreeSet;

public class DataAnalyzer {
	
	public String maximumSalarisedEmployee(TreeSet<Employee> list) throws Exception {
		ArrayList<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee.addAll(list);
		int lastEmployee = listOfEmployee.size() - 1;
		return listOfEmployee.get(lastEmployee).getEmpId() + " "
				+ listOfEmployee.get(lastEmployee).getName()+ " "
				+ listOfEmployee.get(lastEmployee).getDesignation() + " "
				+ listOfEmployee.get(lastEmployee).getSalary();
	}
	public int totalNumberOfEmployee(TreeSet<Employee> listOfEmployee) throws Exception {
		return listOfEmployee.size();
}
}
