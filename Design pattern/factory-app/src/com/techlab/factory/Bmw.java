package com.techlab.factory;

 class Bmw implements IAutomobile{

	@Override
	public void start() {
		System.out.println("Bmw is started");
	}

	@Override
	public void stop() {
		System.out.println("BMW is stopped");
		
	}

}
