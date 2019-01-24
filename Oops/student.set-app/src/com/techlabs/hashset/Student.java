package com.techlabs.hashset;

import java.util.Comparator;
import java.util.HashSet;

public class Student implements Comparable<Student>{
	private String firstName;
	private String lastName;
	private int rollNumber;
	
	public Student(String firstName,String lastName,int rollNumber) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.rollNumber=rollNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getRollNumber() {
		return rollNumber;
	}
	@Override
	public int hashCode() {       //reference equality
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + rollNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {     //content equality
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (rollNumber != other.rollNumber)
			return false;
		return true;
	}

	@Override
	public int compareTo(Student student2) {
		if(this.rollNumber>student2.rollNumber) {
			return 1;
		}
		else if(this.rollNumber<student2.rollNumber) {
			return -1;
		}
		return 0;
	}

	
}
