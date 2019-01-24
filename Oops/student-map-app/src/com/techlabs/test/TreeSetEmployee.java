package com.techlabs.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import com.techlabs.employee.Employee;

public class TreeSetEmployee {

	public static void main(String[] args) {
		Map<Employee, Employee> employeeTree;
		employeeTree = new TreeMap<Employee, Employee>();
		Employee e1 = new Employee(101, "xyz", "abc", 55.00, 163);
		Employee e2 = new Employee(101, "xyz", "abc", 55.00, 163);
		Employee e3 = new Employee(102, "xyz", "abc", 55.00, 169);
		employeeTree.put(e1, e1);
		employeeTree.put(e2, e2);
		employeeTree.put(e3, e3);
		System.out.println(employeeTree.size());
		printMap(employeeTree);
		e1.compareTo(e2);
	}
	public static void printMap(Map<Employee, Employee> employee) {
		Iterator it = employee.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			Object key = pair.getKey();
		    Object value = pair.getValue();
			System.out.println(key.hashCode() + " = " + value.hashCode());
		}
	}

}
