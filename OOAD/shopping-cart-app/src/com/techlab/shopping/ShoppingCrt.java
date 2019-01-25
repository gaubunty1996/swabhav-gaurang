package com.techlab.shopping;

import java.util.Date;
import java.util.List;

import com.techlab.shopping.cart.Customer;
import com.techlab.shopping.cart.LineItem;
import com.techlab.shopping.cart.Order;
import com.techlab.shopping.cart.Product;

public class ShoppingCrt {
	private static double totalBill;
	private static double discountedBill;
	private static double savings;

	public static void main(String[] args) {
		Date date = new Date();
		Customer customer = new Customer("Gaurang", "Thane");
		Order order = new Order(date);
		order.addItem(new LineItem(5, 2, new Product(1, "Apple", 50, 10f)));
		order.addItem(new LineItem(4, 5, new Product(2, "Banana", 50, 10f)));
		order.addItem(new LineItem(4, 5, new Product(2, "Banana", 50, 10f)));
		customer.addOrder(order);
		receiptV3(customer);

	}

	public static void receiptV3(Customer customer) {
		System.out.println("Customer's name is : \t" + customer.getName());
		System.out.println("Customer's location is :" + customer.getLocation());
		for (Order orders : customer.getOrders()) {
			System.out.println("Date: " + orders.getDate() + "\n");
			orderDetails(orders);
		}
		System.out.println("Total bill:" + totalBill);
		System.out.println("Total discounted bill:" + discountedBill);
		System.out.println("Savings :" + (totalBill - discountedBill));
	}

	public static void orderDetails(Order orders) {
		for (int i = 0; i < orders.getItems().size(); i++) {
			System.out.println("Product Id:\t" + orders.getItems().get(i).getProduct().getId() + "\n");
			System.out.println("Product Name :\t" + orders.getItems().get(i).getProduct().getName() + "\n");
			System.out.println("Quantity of purchased product:\t" + orders.getItems().get(i).getQuantity() + "\n");
			System.out.println("Product Orignal Price:\t" + orders.getItems().get(i).getProduct().getCost() + "\n");
			System.out.println("Prodect's discount price: "
					+ orders.getItems().get(i).getProduct().calculateDiscountedPrice() + "\n");
			System.out
					.println("Total orignal price: " + orders.getItems().get(i).itemCostOfLineWithoutDiscount() + "\n");
			System.out.println("Total discounted price: " + orders.getItems().get(i).itemCostOfLineItem() + "\n");
			totalBill = totalBill + orders.getItems().get(i).itemCostOfLineWithoutDiscount();
			discountedBill = discountedBill + orders.getItems().get(i).itemCostOfLineItem();
		}
	}

	public double getTotalBill() {
		return totalBill;
	}

	public double getDiscountedBill() {
		return discountedBill;
	}

	public double getSavings() {
		return savings;
	}

}
