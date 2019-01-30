package com.techlabs.doublelock;
//DataService using double lock

public class DataService {
	private static volatile DataService container;

	private DataService() {
		System.out.println("Data service obj created");
	}

	public void doSomething() {
		System.out.println("DataService is doing something by" + hashCode());
	}

	public static DataService getInstance() {
		if (container == null) {
            synchronized (DataService .class) {
                if (container == null) {
                	container = new DataService();
                }
            }
        }
		return container;
	}
}
