package com.techlab.ispsolution;

public class Robot implements Iworker{

	@Override
	public void startWork() {
		System.out.println("Robot started work");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stopped work");
	}

}
