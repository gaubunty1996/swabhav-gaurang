package com.techlabs.basic;

public class TestOverloading {
	
	private static void printThis(int num) {
		System.out.println(num);
	}
	
	private static void printThis(float num) {
		System.out.println(num);
		System.out.println("float number");
	}
	
	private static void printThis(String num) {
		System.out.println(num);
	}
	
	private static void printThis(double num) {
		System.out.println(num);
	}
	
	private static void printThis(boolean alpha) {
		System.out.println(alpha);
	}
	
	private static void printThis(char alphas) {
		System.out.println(alphas);
	}
	
	
	public static void main(String[] args) {
		
		printThis(10);
		
		printThis(10.5);
		
		printThis(10.5f);
		
		printThis("10");
		
		printThis(true);
		
		printThis('t');
		
		
		//System.out.print("b");
		//System.out.print(123);
		//System.out.print(14.5);
		//System.out.println(true);
		
	}
}
