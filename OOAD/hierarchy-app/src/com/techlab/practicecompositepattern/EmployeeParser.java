package com.techlab.practicecompositepattern;


import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeParser {
	private Set<Employee> empSet = new TreeSet<Employee>();

	public Set<Employee> parse(ArrayList<String> emp) throws Exception {
		String split = ",";
		
		for (String line : emp) {
			String string = line;
			String[] linedata = string.split(split);
			Integer id = Integer.parseInt(linedata[0]);
			String name = linedata[1].replace("\'","");
			String designation = linedata[2].replace("\'","");
			Integer mangerId=linedata[3].equalsIgnoreCase("NULL")?null:Integer.parseInt(linedata[3]);
		
			Employee employee = new Employee(id, mangerId, name, designation);

			empSet.add(employee);
		}
		
		return empSet;

	}
	
}