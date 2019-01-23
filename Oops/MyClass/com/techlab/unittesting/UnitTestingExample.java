package com.techlab.unittesting;

import java.lang.reflect.Type;

public class UnitTestingExample {
	public int cubeOfEven(int number) throws Exception {
		int cubeOfEvenNumber;
		if(number%2==1) {
			throw new Exception("Dont pass odd numbers");
		}
		if(number==(double)number) {
			throw new Exception("Dont pass numbers of type Double");
		}
		if(number==(float)number) {
			throw new Exception("Dont pass numbers of type Float");
		}
		if(number<0) {
			throw new Exception("Dont pass negative numbers");
		}
		if(number%2==1 && number<0) {
			throw new Exception("Dont enter negative odd numbers");
		}
		return number*number*number;
	}
}
