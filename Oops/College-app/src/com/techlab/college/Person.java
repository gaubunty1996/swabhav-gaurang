package com.techlab.college;

public class Person {
	protected int id;
	protected String address;
	protected String dob;
	protected String name;
	
	public Person(int id,String address,String dob,String name) {
		this.id=id;
		this.address=address;
		this.dob=dob;
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public String getDate() {
		return dob;
	}
}
