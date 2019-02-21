package com.techlab.practicecompositepattern;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Set;

public class EmpTest {

	public static void main(String[] args) throws Exception {
		FileLoader fileLoader=new FileLoader("D:\\swabhav-repositry\\OOAD\\hierarchy-app\\src\\com\\techlab\\practicecompositepattern\\dataFile.txt");
		ArrayList<String> list=fileLoader.loadFile();
		
		EmployeeParser employeeParser=new EmployeeParser();
		Set<Employee> empSet=employeeParser.parse(list);
		
		EmployeeHeirarchyBuilder heirarchyBuilder=new EmployeeHeirarchyBuilder(empSet);
		Employee root=heirarchyBuilder.getRoot();
		
		root.display();
		StringBuffer sb=root.displayDetails();
		String employee=sb.toString();
		createXml(employee);
		
		System.out.println(root.displayDetails());
	}
	public static void createXml(String sb) throws Exception {
		FileWriter fileWriter =new FileWriter("D:\\swabhav-repositry\\OOAD\\hierarchy-app\\src\\com\\techlab\\practicecompositepattern\\Employee.xml");
		fileWriter.write(sb);
		System.out.println(sb);
		fileWriter.close();
	}

}