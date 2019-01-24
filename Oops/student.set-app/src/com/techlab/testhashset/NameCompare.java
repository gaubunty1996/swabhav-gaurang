package com.techlab.testhashset;

import java.util.Comparator;

import com.techlabs.hashset.Student;

public class NameCompare implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return -(student1.getFirstName().compareTo(student2.getFirstName()));
	}
	

}
