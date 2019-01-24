package com.techlab.shopping.cart;

public class LineItem {
	private int id;
	private int quantity;
	private Product product;

	public LineItem(int id, int quantity, Product product) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

	public double itemCostOfLineItem() {
		return this.quantity*product.calculateDiscountedPrice();

	}
	public double itemCostOfLineWithoutDiscount() {
		return this.quantity*product.getCost();

	}
}
