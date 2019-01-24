package com.techlabs.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

import com.techlabs.employee.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		Map<Employee, Employee> employee;
		employee = new HashMap<Employee, Employee>();
		Employee e1 = new Employee(101, "xyz", "abc", 55.00, 163);
		Employee e2 = new Employee(101, "xyz", "abc", 55.00, 163);
		Employee e3 = new Employee(101, "xyz", "abc", 55.00, 169);
		employee.put(e1, e1);
		employee.put(e2, e2);
		employee.put(e3, e3);
		System.out.println(employee.size());
		printMap(employee);
		tempfunc(employee);
	}

	public static void printMap(Map<Employee, Employee> employee) {
		Iterator it = employee.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			// avoids a ConcurrentModificationException
		}
	}
	public static void tempfunc(Map<Employee, Employee> employee) {
		Iterator it = employee.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			Object key = pair.getKey();
		    Object value = pair.getValue();
			System.out.println(key.hashCode() + " = " + pair.hashCode());
			// avoids a ConcurrentModificationException
		}
	}

}
