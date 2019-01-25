package com.violationtest;

import srp.violations.Invoice;

public class TestVoilations {

	public static void main(String[] args) {
		Invoice invoice = new Invoice(1, "Apple", 30, 20, 5);
		invoice.calculateTotalCost();
		invoice.printDetails();
	}

}
