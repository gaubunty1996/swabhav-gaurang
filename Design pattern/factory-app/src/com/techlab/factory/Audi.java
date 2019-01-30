package com.techlab.factory;

class Audi  implements IAutomobile{

	@Override
	public void start() {
		System.out.println("Audi is started");
	}

	@Override
	public void stop() {
		System.out.println("Audi is stopped");
	}

}
