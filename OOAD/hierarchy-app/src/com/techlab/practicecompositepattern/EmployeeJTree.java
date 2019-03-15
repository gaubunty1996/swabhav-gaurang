package com.techlab.practicecompositepattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class EmployeeJTree {
	JFrame f;

	public EmployeeJTree() throws Exception {
		init();
	}

	public void init() throws Exception {
		Map<String, DefaultMutableTreeNode> tree = new HashMap<String, DefaultMutableTreeNode>();
		Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();

		FileLoader fileLoader = new FileLoader("D:\\swabhav-repositry\\OOAD\\hierarchy-app\\src\\com\\techlab\\practicecompositepattern\\dataFile.txt");
		ArrayList<String> list = fileLoader.loadFile();

		EmployeeParser employeeParser = new EmployeeParser();
		Set<Employee> empSet = employeeParser.parse(list);
		EmployeeHeirarchyBuilder builder = new EmployeeHeirarchyBuilder(empSet);
		empMap = builder.getEmpMap();
		Employee rootObj = builder.getRoot();

		f = new JFrame();
		for (Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
			DefaultMutableTreeNode obj = new DefaultMutableTreeNode(entry.getValue().getName());
			tree.put(entry.getValue().getName(), obj);
		}

		for (Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
			if (empMap.containsKey(entry.getValue().getMangerId())) {
				Employee employee = empMap.get(entry.getValue().getMangerId());
				Employee repotee = entry.getValue();

				DefaultMutableTreeNode empObj = tree.get(employee.getName());
				DefaultMutableTreeNode repoteeObj=tree.get(repotee.getName());
				
				empObj.add(repoteeObj);
			}
		}
		
		DefaultMutableTreeNode rootTree=tree.get(rootObj.getName());
		
		JTree jt=new JTree(rootTree);
		f.add(jt);
		f.setSize(500, 500);
		f.setVisible(true);
	}

	public static void main(String[] args) throws Exception {
		new EmployeeJTree();
	}
}