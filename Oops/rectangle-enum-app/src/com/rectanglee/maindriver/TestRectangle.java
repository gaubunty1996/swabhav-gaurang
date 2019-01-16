package com.rectanglee.maindriver;

import com.rectangleenum.justclass.Rectangle;
import com.rectangleenum.justclass.ColorOptions;;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(50, 50, ColorOptions.BLUE);
		printDetails(rec);
		printDetails(new Rectangle(60, 60, ColorOptions.RED));
	}

	private static void printDetails(Rectangle rec) {
		System.out.println(rec.calculateArea());
		System.out.println(rec.getLength());
		System.out.println(rec.getWidth());
		System.out.println(rec.getBackGround());

	}

}
