package com.techlab.ispsolution;

public class IspSolution {
	public static void atTheWork(IWorkeat iworked) {
		iworked.startWork();
		iworked.stopWork();
	}
	public static void atTheCafeteria(IEat ieat) {
		ieat.starteat();
		ieat.stopeat();
	}
	public static void main(String[] args) {
		Robot robot = new Robot();
		Manager manager = new Manager();
		
		atTheWork(manager);
		atTheCafeteria(manager);
		//atTheCafeteria(robot);
	}

}
