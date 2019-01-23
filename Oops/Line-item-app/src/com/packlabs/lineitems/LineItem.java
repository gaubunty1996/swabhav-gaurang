package com.packlabs.lineitems;

public class LineItem {
	private int id;
	private String name;
	private double cost;
	private int quantity;

	public LineItem(int id, String name, double cost, int quantity) {
		this.id = id;
		this.cost = cost;
		this.name = name;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public int getQuantity() {
		return quantity;
	}
	public double calculate() {
		return this.cost*this.quantity;
	}
}
