package com.techlab.ispsolution;

public class Manager implements IWorkeat {

	@Override
	public void starteat() {
		System.out.println("Manager started eating");
	}

	@Override
	public void stopeat() {
		System.out.println("Manager stoped eating");
		
	}

	@Override
	public void startWork() {
		System.out.println("Manager started working");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Manager stopped working");
		
	}

}
