package com.techlabs.singletonpattern;

public class DataService {
	private static DataService container;

	private DataService() {
		System.out.println("Data service obj created");
	}

	public void doSomething() {
		System.out.println("DataService is doing something by" + hashCode());
	}

	public static DataService getInstance() {
		if (container == null) {
			container = new DataService();
			return container;
		}
		return container;
	}
}
