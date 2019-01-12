package com.techlabs.basic;

import java.util.Arrays;

public class TestIntegerArray {
	
	public static void NumberToZero(int n) {
		n=0;
	}
	
	public static void AllNumbersTZero(int[] ns) {
		for(int i:ns) {
			i=0;
		}
	} 
	
	public static void main(String[] args) {
		
		int num = 10;
		
		int[] nos= {10,20,30,40};
		
		NumberToZero(num);
		
		System.out.print(num);
		
		AllNumbersTZero(nos);
		
		System.out.println(Arrays.toString(nos));
		
		
	}
	
}
