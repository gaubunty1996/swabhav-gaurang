package com.techlab.testlineitem;

import java.util.ArrayList;

import com.packlabs.lineitems.LineItem;

public class TestLineItemGenerics {

	public static void main(String[] args) {
		ArrayList<LineItem> cart = new ArrayList<>();
		double total = 0;

		cart.add(new LineItem(2, "pen", 25.09, 5));
		cart.add(new LineItem(5, "book", 10, 3));
		cart.add(new LineItem(6, "shoes", 55, 4));
		cart.add(new LineItem(3, "socks", 35, 7));
		cart.add(new LineItem(200, "watches", 350, 8));
		
		for (LineItem eachElement:cart) {
			total=total+eachElement.calculate();
		}
		System.out.println("total cost of your cart is: "+total);
		
		for (LineItem eachElement:cart) {
			System.out.println(eachElement.getQuantity()+" "+eachElement.getName()+" "+eachElement.calculate());
		}
	}

}
