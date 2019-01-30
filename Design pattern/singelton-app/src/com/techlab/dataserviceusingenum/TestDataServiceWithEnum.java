package com.techlab.dataserviceusingenum;

import com.techlabs.singletonpattern.DataService;

public class TestDataServiceWithEnum {
	public static void main(String[] args) {
		DataService dataservice = DataService.getInstance();
		dataservice.doSomething();
		DataService dataservice2 = DataService.getInstance();
		dataservice2.doSomething();
		
		System.out.println(dataservice.hashCode());
		System.out.println(dataservice2.hashCode());
	}
}
