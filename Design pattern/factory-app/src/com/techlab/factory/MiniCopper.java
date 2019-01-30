package com.techlab.factory;

public class MiniCopper implements IAutomobile{

	@Override
	public void start() {
		System.out.println("Minicopper is started");
	}

	@Override
	public void stop() {
		System.out.println("Minicopper is stopped");
	}

}
