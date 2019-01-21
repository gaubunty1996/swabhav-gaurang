package com.techlab.employeeTest;

import com.techlabs.employee.Accountant;
import com.techlabs.employee.Developer;
import com.techlabs.employee.Employee;
import com.techlabs.employee.Manager;

public class GenerateSalary {
	public static void printPaySlip(Employee employee) {
		employee.salary();
		System.out.println("Employee's role : " + employee.getRole());
		System.out.println("Employee's salary : " + employee.getSalary());
		if(employee.getHouseRentalAllowance()>0) {
			System.out.println("Employee's house rentanl allowance : " + employee.getHouseRentalAllowance());
		}
		if(employee.getPerformanceAllowance()>0) {
			System.out.println("Employee's performance allowance : " + employee.getPerformanceAllowance());
		}
		if(employee.getTravelAllowance()>0) {
			System.out.println("Employee's travel rentanl allowance : " + employee.getTravelAllowance());
		}
		if(employee.getPerks()>0) {
			System.out.println("Employee's perks : " + employee.getPerks());
		}
		System.out.println("\n");
		
		
	}

	public static void main(String[] args) {
		Manager manager = new Manager("Gaurang", 1, "Manager");
		printPaySlip(manager);

		Accountant accountant = new Accountant("Jaaie", 2, "Accountant");
		printPaySlip(accountant);

		Developer developer = new Developer("soham", 3, "Developer");
		printPaySlip(developer);
	}
}
