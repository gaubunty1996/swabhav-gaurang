package com.techlabs.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle();

		System.out.println("Current value of width is : " + rectangle.getWidth());
		System.out.println("Current value of Length is : " + rectangle.getLength());

		rectangle.setLength(20);
		rectangle.setWidth(5);

		System.out.println("Current value of width is : " + rectangle.getWidth());
		System.out.println("Current value of Length is : " + rectangle.getLength());

		System.out.println("Area of Rectangle :  " + rectangle.calculateArea());
	}

}
