package com.techlab.testemployeedataanalyzer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.techlab.employeedataanlayzer.CompareTheSalary;
import com.techlab.employeedataanlayzer.DataAnalyzer;
import com.techlab.employeedataanlayzer.DiskLoader;
import com.techlab.employeedataanlayzer.Employee;
import com.techlab.employeedataanlayzer.Parser;
import com.techlab.employeedataanlayzer.UrlLoader;

public class TestParser {

	public static void main(String[] args) throws Exception {

		Parser parser = new Parser();
		parser.parse(new UrlLoader());

		parser.parses(new DiskLoader());

		DataAnalyzer analyze = new DataAnalyzer();
		CompareTheSalary comparethesalary = new CompareTheSalary();
		Collections.sort(parser.employees, comparethesalary);
		System.out.println("Max salary" + parser.employees.get(parser.employees.size() - 1).getSalary());
		System.out.println("Maximum salaried employee is: " + analyze.maximumSalarisedEmployees(parser.employees));
		System.out.println(analyze.CountOfEmployeeByDesignation(parser.uniqueEmployeeList));
		System.out.println(analyze.CountOfEmployeeByDepartmentNumber(parser.uniqueEmployeeList));

	}

}
