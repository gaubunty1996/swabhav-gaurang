package com.techlab.factorytest;

import com.techlab.factory.AutoConfigType;
import com.techlab.factory.AutomobileFactory;
import com.techlab.factory.IAutomobile;

public class Client {
	public static void main(String[] args) {
		AutomobileFactory automobileFactory = AutomobileFactory.getNewInstance();
		IAutomobile bmw=automobileFactory.make(AutoConfigType.BMW);
		System.out.println(bmw.getClass());
		bmw.start();
		bmw.stop();

	}
}
