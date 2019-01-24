package com.techlab.testhashset;

import java.util.Comparator;

import com.techlabs.hashset.Student;

public class LastNameCompare implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return -(student2.getLastName().compareTo(student1.getLastName()));
	}

}
