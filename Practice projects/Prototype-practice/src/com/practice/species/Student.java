package com.practice.species;

class Student18 implements Cloneable {
	int rollno;
	String name;
	String lastName;

	Student18(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String args[]) {
		try {
			Student18 s1 = new Student18(101, "amit");
			s1.setLastName("Kadam");

			Student18 s2 = (Student18) s1.clone();
			s2.setLastName("bhoslae");
			Student18 s3 = s1;
			s3.setName("Gaurang");
			s3.setLastName("Kadam");

			System.out.println(s1.rollno + " " + s1.name + " " + s1.lastName + " Hashcode for s1:" + s1.hashCode());
			System.out.println(s2.rollno + " " + s2.name + " " + s2.lastName + " Hashcode for s2:" + s2.hashCode());
			System.out.println(s3.rollno + " " + s3.name + " " + s3.lastName + " Hashcode for s3:" + s3.hashCode());

		} catch (CloneNotSupportedException c) {
		}

	}
}