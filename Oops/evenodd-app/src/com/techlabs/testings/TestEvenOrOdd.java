package com.techlabs.testings;

import com.techlab.evenodd.EvenOrOdd;

public class TestEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EvenOrOdd evod = new EvenOrOdd();

		System.out.println("current range is:" + evod.getRange());
		evod.setRange(50);
		System.out.println("current range is:" + evod.getRange());

		evod.generatingEven(evod.getRange());
		evod.generatingOdd(evod.getRange());
	}

}
