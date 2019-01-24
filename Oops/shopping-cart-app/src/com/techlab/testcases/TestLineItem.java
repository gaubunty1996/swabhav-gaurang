package com.techlab.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.shopping.cart.LineItem;
import com.techlab.shopping.cart.Product;

class TestLineItem {

	@Test
	void checkId() {
		LineItem lineitem = new LineItem(5, 2, new Product(5,"Apple",25,10f));
		int resultId=lineitem.getId();
		assertEquals(5, resultId);
	}
	@Test
	void checkQuantity() {
		LineItem lineitem = new LineItem(5, 2, new Product(5,"Apple",25,10f));
		int resultQuantity=lineitem.getQuantity();
		assertEquals(2, resultQuantity);
	}
	@Test
	void checkProduct() {
		LineItem lineitem = new LineItem(5, 2, new Product(5,"Apple",25,10f));
		float resultDiscount=lineitem.getProduct().getDiscount();
		assertEquals(10f, resultDiscount);
	}
	@Test
	void checkItemCostOfLineItem() {
		LineItem lineitem = new LineItem(5, 2, new Product(5,"Apple",25,10f));
		double resultDiscount=lineitem.itemCostOfLineItem();
		assertEquals(50, resultDiscount);
	}
}
