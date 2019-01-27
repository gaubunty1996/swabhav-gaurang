package com.ispvoilation.test;

import ispVoilation.IWorked;
import ispVoilation.Manager;
import ispVoilation.Robot;

public class TestIsp {
	public static void atTheWork(IWorked iworker) {
		System.out.println("At the work");

		iworker.startWork();
		iworker.stopWork();

	}

	public static void atTheCafeteria(IWorked iworker) {
		iworker.starteat();
		iworker.stopeat();
	}

	public static void main(String[] args) {
		Robot robot = new Robot();
		Manager manager = new Manager();
		try {
		atTheWork(manager);
		atTheCafeteria(manager);
		atTheWork(robot);
		atTheCafeteria(robot);// voilates lsp principle
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
