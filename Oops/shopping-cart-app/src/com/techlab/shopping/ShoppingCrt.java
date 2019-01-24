package com.techlab.shopping;

import java.util.Date;
import java.util.List;

import com.techlab.shopping.cart.Customer;
import com.techlab.shopping.cart.LineItem;
import com.techlab.shopping.cart.Order;
import com.techlab.shopping.cart.Product;

public class ShoppingCrt {

	public static void main(String[] args) {
		Date date = new Date();
		Customer customer = new Customer("Gaurang", "Thane");
		Order order = new Order(date);
		order.addItem(new LineItem(5, 2, new Product(1, "Apple", 50, 10f)));
		order.addItem(new LineItem(4, 5, new Product(2, "Banana", 50, 10f)));
		// System.out.println(order.getItems());
		// receipt(order);
		customer.addOrder(order);
		receiptV2(customer);
	}

	public static void receiptV2(Customer customer) {
		System.out.println("Customer's name is : \t" + customer.getName());
		System.out.println("Customer's location is :" + customer.getLocation());
		for (Order orders : customer.getOrders()) {
			System.out.println("Product Id:\t" + orders.getItems().get(0).getProduct().getId() + "\t");
			System.out.println("Product Name :\t" + orders.getItems().get(0).getProduct().getName());
			System.out.println("Quantity of purchased product:\t" + orders.getItems().get(0).getQuantity());
			System.out.println("Product Orignal Price:\t" + orders.getItems().get(0).getProduct().getCost() + "\t");
			System.out.println(
					"Prodect's discount price: " + orders.getItems().get(0).getProduct().calculateDiscountedPrice());
			System.out.println("Total price: " + orders.getItems().get(1).itemCostOfLineWithoutDiscount());
			System.out.println("Total price: " + orders.getItems().get(1).itemCostOfLineItem());

		}
	}

	public static void receipt(Order order) { // bullshit logic
		for (LineItem eachorder : order.getItems()) {
			System.out.println("Product Name:\t" + eachorder.getProduct().getName() + "\t");
			System.out.println("Product Orignal Price:\t" + eachorder.getProduct().getCost() + "\t");
			System.out.println("Prodect's discount price\t" + eachorder.getProduct().calculateDiscountedPrice());
			System.out.println("Product Id:\t" + eachorder.getProduct().getId() + "\t");
			System.out.println("Quantity of purchased product" + eachorder.getQuantity());
		}
		System.out.println("Price to pay before discount" + order.totalPriceWithoutDiscount());
		System.out.println("Price is to pay after applying discount :" + order.checkOutPrice());
	}

}
