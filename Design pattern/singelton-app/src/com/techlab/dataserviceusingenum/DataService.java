package com.techlab.dataserviceusingenum;

public enum DataService {
	INSTANCE;

	private DataService() {
		System.out.println("Data service obj created");
	}

	public void doSomething() {
		System.out.println("DataService is doing something by" + hashCode());
	}

	public static DataService getInstance() {

		return DataService.INSTANCE;
	}
}
