package com.techlabs.singletonpattern;

public class TestDataServiceUsingDoubleLock {

	public static void main(String[] args) {
		DataService dataservice = DataService.getInstance();
		dataservice.doSomething();
		DataService dataservice2 = DataService.getInstance();
		dataservice2.doSomething();
		
		System.out.println(dataservice.hashCode());
		System.out.println(dataservice2.hashCode());

	}

}
