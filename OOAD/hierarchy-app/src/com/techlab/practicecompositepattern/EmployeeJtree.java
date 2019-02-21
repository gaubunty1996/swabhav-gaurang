package com.techlab.practicecompositepattern;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class EmployeeJtree {
	private Employee root;
	JFrame frame;

	public EmployeeJtree() {
	}
	public void addReporteeNode(Employee employee,Set<Employee> empSet,DefaultMutableTreeNode managers) {
		for(Employee emp:empSet) {
			if( !emp.getDesignation().contains("PRESIDENT")&& (int)employee.getEmpId()==(int)emp.getMangerId()) {
				DefaultMutableTreeNode reportee = new DefaultMutableTreeNode(emp.getName());
				managers.add(reportee);
				for(Employee repemp:empSet) {
					System.out.println(repemp.getName() + " " + repemp.getDesignation() + " EmployeeId: " + repemp.getEmpId()+" ManagerID: "+repemp.getMangerId());
					if((int)repemp.getEmpId()==(int)employee.getMangerId() && repemp.getName()!="KING") {
						System.out.println("hello");
					}
				}
			}
	}
	}
	public void addManagerNode(Employee employee,DefaultMutableTreeNode ceo,Set<Employee> empSet) {
		if(employee.getDesignation().contains("MANAGER")) {
			//System.out.println(employee.getName() + " " + employee.getDesignation() + " EmployeeId: " + employee.getEmpId()+" ManagerID: "+employee.getMangerId()+"\n\n");
			DefaultMutableTreeNode managers=new DefaultMutableTreeNode(employee.getName());
			ceo.add(managers);
			addReporteeNode(employee, empSet, managers);
		}
	}
	public void createtree(EmployeeHeirarchyBuilder heirarchyBuilder, Set<Employee> empSet) {
		frame = new JFrame();
		DefaultMutableTreeNode ceo = new DefaultMutableTreeNode(this.getroot().getName());
		for (Employee employee : empSet) {
			//System.out.println(employee.getName() + " " + employee.getDesignation() + " EmployeeId: " + employee.getEmpId()+" ManagerID: "+employee.getMangerId());
			addManagerNode(employee, ceo, empSet);
		}

		JTree jtree = new JTree(ceo);
		frame.add(jtree);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

	public Employee getroot() {
		return root;
	}

	public void setRoot(Employee root) {
		this.root = root;
	}

	public static void main(String[] args) throws Exception {
		EmployeeJtree tree = new EmployeeJtree();
		FileLoader fileLoader = new FileLoader(
				"D:\\swabhav-repositry\\OOAD\\hierarchy-app\\src\\com\\techlab\\practicecompositepattern\\dataFile.txt");
		ArrayList<String> list = fileLoader.loadFile();

		EmployeeParser empparse = new EmployeeParser();

		Set<Employee> empSet = empparse.parse(list);

		EmployeeHeirarchyBuilder heirarchyBuilder = new EmployeeHeirarchyBuilder(empSet);
		tree.setRoot(heirarchyBuilder.getRoot());

		//System.out.println(tree.getroot().getEmpId());
		tree.createtree(heirarchyBuilder, empSet);

	}

}
