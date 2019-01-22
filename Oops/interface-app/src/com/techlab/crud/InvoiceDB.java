package com.techlab.crud;
import com.techlab.crud.ICrudable;

public class InvoiceDB implements ICrudable{

	@Override
	public void create() {
		System.out.println("InvoiceDB created");		
	}

	@Override
	public void read() {
		System.out.println("InvoiceDB is been readed");		
	}

	@Override
	public void update() {
		System.out.println("InvoiceDB is been updated");		
	}

	@Override
	public void delete() {
		System.out.println("InvoiceDB is been deleted");		
	}

}
