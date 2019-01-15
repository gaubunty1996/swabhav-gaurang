package com.techlabs.TestCircle;

import com.techlab.circle.Circle;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle();

		System.out.println("Current value of pie is: " + circle.getValueOfPie());
		System.out.println("Current value of radius is: " + circle.getRadius());

		circle.setRadius(55);

		System.out.println("Current value of pie is: " + circle.getValueOfPie());
		System.out.println("Current value of radius is: " + circle.getRadius());

		System.out.println("Area of circle is: " + circle.calculateArea());
		System.out.println("Circumference is: " + circle.calculateCircumference());

		circle.setRadius(-55);

		System.out.println("Current value of pie is: " + circle.getValueOfPie());
		System.out.println("Current value of radius is: " + circle.getRadius());

		System.out.println("Area of circle is: " + circle.calculateArea());
		System.out.println("Circumference is: " + circle.calculateCircumference());
	}

}
