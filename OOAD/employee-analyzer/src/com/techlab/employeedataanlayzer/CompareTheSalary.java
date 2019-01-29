package com.techlab.employeedataanlayzer;

import java.util.Comparator;

public class CompareTheSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getSalary() - o2.getSalary();
	}

}
