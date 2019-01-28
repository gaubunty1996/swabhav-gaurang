package com.techlab.employeedataanlayzer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import com.techlab.employeedataanlayzer.ILoader;
import com.techlab.employeedataanlayzer.DiskLoader;
import com.techlab.employeedataanlayzer.UrlLoader;

public class Parser  {
	Employee employee;
	public ArrayList<Employee> employees = new ArrayList<Employee>();
	
	  public ArrayList<Employee> parses(ILoader iloader) throws IOException {
	  
	  for (String line : iloader.load()) { String[] details = line.split(",");
	  Employee employee = new Employee();
	  employee.setEmpId(Integer.parseInt(details[0]));
	  employee.setName(details[1]); employee.setDesignation(details[2]);
	  employee.setManagerId(details[3]); employee.setDateOfJoining(details[4]);
	  employee.setSalary(Integer.parseInt(details[5]));
	  employee.setCommission(details[6]);
	  employee.setDepartmentNumber(Integer.parseInt(details[7]));
	  employees.add(employee); } return null;
	  
	  }
	 
	public TreeSet<Employee> uniqueEmployeeList = new TreeSet<Employee>();

	public ArrayList<Employee> parse(ILoader iloader) throws IOException {

		for (String line : iloader.load()) {
			String[] details = line.split(",");
			Employee employee = new Employee();
			employee.setEmpId(Integer.parseInt(details[0]));
			employee.setName(details[1]);
			employee.setDesignation(details[2]);
			employee.setManagerId(details[3]);
			employee.setDateOfJoining(details[4]);
			employee.setSalary(Integer.parseInt(details[5]));
			employee.setCommission(details[6]);
			employee.setDepartmentNumber(Integer.parseInt(details[7]));
			uniqueEmployeeList.add(employee);
		}
		return null;

	}

}
