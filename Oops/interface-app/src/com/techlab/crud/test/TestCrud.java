package com.techlab.crud.test;

import com.techlab.crud.CustomerDB;
import com.techlab.crud.ICrudable;
import com.techlab.crud.InvoiceDB;
import com.techlab.crud.OrderDB;

public class TestCrud {

	public static void main(String[] args) {
		doDbOperation(new CustomerDB());
		doDbOperation(new OrderDB());
		doDbOperation(new InvoiceDB());
		
	}

	public static void doDbOperation(ICrudable x) {
		x.create();
		x.read();
		x.update();
		x.delete();
		System.out.println("\n");
	}

}
