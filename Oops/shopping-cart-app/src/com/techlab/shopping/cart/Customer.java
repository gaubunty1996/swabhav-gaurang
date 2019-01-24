package com.techlab.shopping.cart;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private String location;
	List<Order>orders =new ArrayList<Order>();

	public Customer() {
	}

	public Customer(String name, String location) {
		this.location = location;
		this.name = name;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}
}
