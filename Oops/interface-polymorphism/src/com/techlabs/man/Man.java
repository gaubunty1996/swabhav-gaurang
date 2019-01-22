package com.techlabs.man;

public class Man implements IMannerable{

	@Override
	public void wish() {
		System.out.println("Man says GoodMorinig !");
	}

	@Override
	public void depart() {
		System.out.println("Man says GoodBye !");
		
	}

}
