package com.teschlab.factory.method;

public class TestFactoryMethod {
	public static void main(String[] args) {
		IAutoFactory iautofactory = BmwFactory.getInstance();
		AutoMobile automobile = iautofactory.make();
		automobile.start();
		automobile.stop();
		System.out.println(automobile.getClass());

	}
}
