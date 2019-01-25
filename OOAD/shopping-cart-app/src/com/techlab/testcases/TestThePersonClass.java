package com.techlab.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.shopping.cart.Product;

class TestThePersonClass {

	@Test
	void checkId() {
		Product product1 = new Product(123, "Apple", 55, 10f); 
		int resultId=product1.getId();
		assertEquals(123, resultId);
	}
	@Test
	void checkName() {
		Product product1 = new Product(123, "Apple", 55, 10f); 
		String resultName=product1.getName();
		assertEquals("Apple", resultName);
	}
	@Test
	void checkCost() {
		Product product1 = new Product(123, "Apple", 55, 10f); 
		double resultCost=product1.getCost();
		assertEquals(55, resultCost);
	}
	@Test
	void checkDiscount() {
		Product product1 = new Product(123, "Apple", 55, 10f); 
		float resultDiscount=product1.getDiscount();
		assertEquals(10, resultDiscount);
	}
	@Test
	void checkDiscountedPrice() {
		Product product1 = new Product(123, "Apple", 100, 10f); 
		double discountedPrice=product1.calculateDiscountedPrice();

		assertEquals(90,discountedPrice);
	}

}
