package com.techlab.testlineitem;

import java.util.ArrayList;

import com.packlabs.lineitems.LineItem;

public class TestLineItem {
	public static void main(String[] args) {
		ArrayList cart = new ArrayList();
		double total=0;
		
		cart.add(new LineItem(2, "pen", 25.09, 5));
		cart.add(new LineItem(5, "book", 10, 3));
		cart.add(new LineItem(6, "shoes", 55, 4));
		cart.add(new LineItem(3, "socks", 35, 7));
		cart.add(new LineItem(200, "watches", 350, 8));
		cart.add("swabhavTechlabs");
		cart.add(100);
		for (Object eachElement:cart) {
			LineItem lineitem = (LineItem)eachElement;
			total=total+lineitem.calculate();
		}
		System.out.println("total cost of your cart is: "+total);
		
		for (Object eachElement:cart) {
			LineItem lineitem = (LineItem)eachElement;
			System.out.println(lineitem.getQuantity()+" "+lineitem.getName()+" "+lineitem.calculate());
		}
	}
}
