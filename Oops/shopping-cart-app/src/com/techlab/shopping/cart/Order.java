package com.techlab.shopping.cart;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Order {
	
	List<LineItem>items = new ArrayList<LineItem>();
	private Date date;
	private Calendar calender;
	private double totalCheckOutPrice;
	
	public Order(Date date) {
		this.date=date;
	}
	
	public void addItem(LineItem lineItemm) {
		items.add(lineItemm);
		
	}
	public double checkOutPrice() {
		for(LineItem eachLineItem:items) {
			totalCheckOutPrice=totalCheckOutPrice+eachLineItem.itemCostOfLineItem();
		}
		return totalCheckOutPrice;
	}
	public double totalPriceWithoutDiscount() {
		for(LineItem eachLineItem:items) {
			totalCheckOutPrice=totalCheckOutPrice+eachLineItem.itemCostOfLineWithoutDiscount();
		}
		return totalCheckOutPrice;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public Date getDate() {
		return date;
	}

	public Calendar getCalender() {
		return calender;
	}
	
}
