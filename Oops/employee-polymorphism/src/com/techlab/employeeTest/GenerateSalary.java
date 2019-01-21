package com.techlab.employeeTest;

import com.techlabs.employee.Accountant;
import com.techlabs.employee.Employee;
import com.techlabs.employee.Manager;

public class GenerateSalary {

	public static void main(String[] args) {
		Manager manager1 = new Manager("Gaurang", 1, "Manager");
		generatePaySlip(manager1);
		System.out.println(manager1.getSalary());
		
		Accountant accountant = new Accountant("Jaaie", 1, "Accountant");
		generatePaySlip(accountant);
		System.out.println(accountant.getSalary());
	}

	public static void generatePaySlip(Employee employee) {
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getEmployeeNumber());
		employee.salary();
	}
}
