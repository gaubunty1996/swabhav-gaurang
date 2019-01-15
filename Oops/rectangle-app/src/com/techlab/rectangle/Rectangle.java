package com.techlab.rectangle;

public class Rectangle {

	private int width;
	private int height;

	public int calculateArea() {

		return width * height;
	}

	public int getWidth() {
		return width;
	}

	public int getLength() {
		return height;
	}

	public void setWidth(int newValue) {

		width = validateTheValues(newValue);

	}

	public void setLength(int newValue) {

		height = validateTheValues(newValue);

	}

	public int validateTheValues(int value) {
		if (value > 100) {

			return 100;
		}
		if (value < 0) {

			return 1;
		}
		return value;

	}

}
