package com.techlab.testemployeedataanalyzer;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.techlab.employeedataanlayzer.CompareTheSalary;
import com.techlab.employeedataanlayzer.DataAnalyzer;
import com.techlab.employeedataanlayzer.DiskLoader;
import com.techlab.employeedataanlayzer.Employee;
import com.techlab.employeedataanlayzer.Parser;
import com.techlab.employeedataanlayzer.UrlLoader;

public class TestParser {
	private static ArrayList<Employee> em = new ArrayList<Employee>();
	public static void hello(HashMap<Integer, Employee> mp) {
		Iterator it = mp.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        em.add((Employee)pair.getValue());
	        System.out.println(pair.getKey() + " = " + (Employee)pair.getValue());
	        it.remove(); // avoids a ConcurrentModificationException
	    }
	}

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
		Employeehierarchy h = new Employeehierarchy(parser.uniqueEmployeeList);
		hello(h.getEmployeeMap());
		for(Employee emppp:em) {
			System.out.println(emppp.getName());
		}
		
		
		//System.out.println(h.getEmployeeList());
	}
	
	
	

}
