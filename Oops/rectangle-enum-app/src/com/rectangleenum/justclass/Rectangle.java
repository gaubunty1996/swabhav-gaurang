package com.rectangleenum.justclass;

import com.rectangleenum.justclass.ColorOptions;;

public class Rectangle {
	private int width;
	private int length;
	private ColorOptions backgroundColor = ColorOptions.BLUE;

	public Rectangle(int newValueWidth, int newValueLength) {
		this.width = newValueWidth;
		this.length = newValueLength;
	}

	public Rectangle(int newValueWidth, int newValueLength, ColorOptions backgroundColor) {
		this.width = newValueWidth;
		this.length = newValueLength;
		this.backgroundColor = backgroundColor;

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

	public ColorOptions getBackGround() {
		return backgroundColor;
	}

}
