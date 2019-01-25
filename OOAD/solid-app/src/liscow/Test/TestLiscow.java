package liscow.Test;

import liscow.principle.Rectangle;
import liscow.principle.Square;

public class TestLiscow {
	public static void showDetails(Rectangle x) {
	 int beforeChange = x.getWidth();
	 x.setHeight(100);
	 int afterChange = x.getWidth();
	 System.out.println("Before changing: "+beforeChange);
	 System.out.println("after changing: "+afterChange);
		
	}

	public static void main(String[] args) {
		showDetails(new Rectangle(5, 5));
		showDetails(new Square(5));
	}
}
