package com.techlab.testhashset;

import java.util.Comparator;

import com.techlabs.hashset.Student;

public class RollCompare implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		if(student1.getRollNumber() >student2.getRollNumber()){
            return 1;
        } else {
            return -1;
        }
	}

}
