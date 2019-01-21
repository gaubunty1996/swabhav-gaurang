package com.techlabs.man;

public class Boy extends Man {
	public Boy() {
		super();
		System.out.println("Boy is created");
	}
	public void walk() {
		System.out.println("Boy is walking");
	}
	@Override
	public void play() {
		System.out.println("Boy is playing");
	}

}
