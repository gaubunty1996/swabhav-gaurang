package com.techlab.rectangle.constructor.test;

import com.techlab.rectangle.constructor.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDetails(new Rectangle(50, 50));
		Rectangle rectangle = new Rectangle(10, 2, "Black");
		printDetails(rectangle);
		printDetails(new Rectangle(50, 50, "red"));
		printDetails(new Rectangle(50, 50, "gReen"));
		printDetails(new Rectangle(50, 50, "foo"));

	}

	static private void printDetails(Rectangle rectangle) {
		System.out.println("width is : " + rectangle.getWidth());
		System.out.println("length is : " + rectangle.getLength());
		System.out.println("Area is : " + rectangle.calculateArea());
		System.out.println("Area is : " + rectangle.getBgColor());
	}

}
