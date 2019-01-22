package com.techlabs.man;

public class Boy implements IMannerable,IEmotional {

	@Override
	public void cry() {
		System.out.println("Boy is crying");
	}

	@Override
	public void laugh() {
		System.out.println("Boy is laughing");
	}

	@Override
	public void wish() {
		System.out.println("Boy is saying goodmorning");		
	}

	@Override
	public void depart() {
		System.out.println("Boy is saying bye");		
	}

}
