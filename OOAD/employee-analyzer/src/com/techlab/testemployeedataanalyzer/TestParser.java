package com.techlab.testemployeedataanalyzer;

import java.util.Iterator;

import com.techlab.employeedataanlayzer.DataAnalyzer;
import com.techlab.employeedataanlayzer.Employee;
import com.techlab.employeedataanlayzer.Parser;
import com.techlab.employeedataanlayzer.UrlLoader;

public class TestParser {

	public static void main(String[] args) throws Exception {
		int ManagerCount = 0;
		int ClerkCount;
		int AnalystCount;
		int PresidentCount;
		int SalesmanCount;
		int numberOfPeopleInDepartmentNumber10 = 0;
		int numberOfPeopleInDepartmentNumber20 = 0;
		int numberOfPeopleInDepartmentNumber30 = 0;
		Parser parser = new Parser();
		parser.parse(new UrlLoader());
		parser.parses(new UrlLoader());
		DataAnalyzer analyze = new DataAnalyzer();
		System.out.println(
				"Maximum salaried employee is: " + analyze.maximumSalarisedEmployee(parser.uniqueEmployeeList));
		System.out.println("Total number of employees: " + analyze.totalNumberOfEmployee(parser.uniqueEmployeeList));
		for (Employee element : parser.uniqueEmployeeList) {
			// System.out.println(element.getDesignation());
			if (element.getDepartmentNumber() == 10) {
				numberOfPeopleInDepartmentNumber10 = numberOfPeopleInDepartmentNumber10 + 1;
			}
			if (element.getDepartmentNumber() == 20) {
				numberOfPeopleInDepartmentNumber20 = numberOfPeopleInDepartmentNumber20 + 1;
			}
			if (element.getDepartmentNumber() == 30) {
				numberOfPeopleInDepartmentNumber30 = numberOfPeopleInDepartmentNumber30 + 1;
			}
		}
		System.out.println("number Of People In Department Number 10: " + numberOfPeopleInDepartmentNumber10);
		System.out.println("number Of People In Department Number 20: " + numberOfPeopleInDepartmentNumber20);
		System.out.println("number Of People In Department Number 30: " + numberOfPeopleInDepartmentNumber30);
	}
}
