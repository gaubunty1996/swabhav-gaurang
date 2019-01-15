package com.techlab.circle;

public class Circle {

	private final float PIE = 3.14f;
	private float radius;

	public float calculateArea() {

		return PIE * radius * radius;
	}

	public float getValueOfPie() {
		return PIE;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float newValue) {
		if (newValue < 0) {
			radius = 1;
		}
		if (newValue > 0) {
			radius = newValue;
		}
	}

	public float calculateCircumference() {

		return 2 * PIE * radius;

	}
}
