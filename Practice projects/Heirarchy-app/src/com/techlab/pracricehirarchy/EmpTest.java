package com.techlab.pracricehirarchy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmpTest {
	
	
	
	public static void main(String []args) throws Exception {
		Set<Employee> empSet=readFile();
		Employee president = getEmpStructure(empSet);
		president.ls();
		
	}
	
	private static Set<Employee> readFile() throws Exception{
		FileInputStream fis = new FileInputStream("D:\\swabhav-repositry\\Practice projects\\Heirarchy-app\\src\\com\\techlab\\pracricehirarchy\\dataFile.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String str;
		Set<Employee> empSet = new HashSet<>();
		while((str=br.readLine())!=null) {
			String[] row = str.split(",");
			empSet.add(new Employee(Integer.parseInt(row[0]),row[3].equalsIgnoreCase("NULL")?null:Integer.parseInt(row[3]),row[1]));
		}
		return empSet;	
	}
	
	private static Employee getEmpStructure(Set<Employee> empSet) {
		Employee rootEmp = null;
		for(Employee emp : empSet) {
			if(emp.getMgrId()==null)
				rootEmp = emp;
			else {
				Employee mgr = getManager(emp,empSet);
				mgr.getTeamMembers().add(emp);
			}
		}
		return rootEmp;
	}
	
	private static Employee getManager(Employee emp,Set<Employee> empList) {
		for(Employee e:empList)
			if(emp.getMgrId().equals(e.getEmpId()))
				return e;
		return null;
	}
}