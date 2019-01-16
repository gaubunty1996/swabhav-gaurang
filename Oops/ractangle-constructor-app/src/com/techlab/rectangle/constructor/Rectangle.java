package com.techlab.rectangle.constructor;

public class Rectangle {
	private int width;
	private int length;
	private String bgColor = "blue";

	public Rectangle(int newValueWidth, int newValueLength) {
		this.width = newValueWidth;
		this.length = newValueLength;
	}

	public Rectangle(int newValueWidth, int newValueLength, String newColor) {
		this.width = newValueWidth;
		this.length = newValueLength;
		if (newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("green")
				|| newColor.equalsIgnoreCase("blue")) {
			this.bgColor = newColor.toLowerCase();
		}
	}

	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}

	public int calculateArea() {
		return width * length;
	}

	public String getBgColor() {
		return bgColor;
	}
}
