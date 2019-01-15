package com.techlab.evenodd;

public class EvenOrOdd {

	private int range = 100;

	public void generatingEven(int range) {
		System.out.print("Even: ");
		for (int i = 0; i <= range; i = i + 2) {
			if (i % 2 == 0) {
				System.out.print(" " + i + " ");
			}
		}
		System.out.println("");

	}

	public void generatingOdd(int range) {
		System.out.print("Odd: ");
		for (int i = 0; i <= range; i++) {
			if (i % 2 == 1) {
				System.out.print(" " + i + " ");
			}
		}
		System.out.println("");

	}

	public int getRange() {
		return range;
	}

	public void setRange(int newRange) {
		range = newRange;
	}
}
