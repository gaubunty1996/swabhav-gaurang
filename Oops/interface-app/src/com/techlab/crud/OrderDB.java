package com.techlab.crud;
import com.techlab.crud.ICrudable;

public class OrderDB implements ICrudable{

	@Override
	public void create() {
		System.out.println("OrderDB is been created");		
	}

	@Override
	public void read() {
		System.out.println("OrderDB is been readed");		
	}

	@Override
	public void update() {
		System.out.println("OrderDB is been updated");		
	}

	@Override
	public void delete() {
		System.out.println("OrderDB is been deleted");		
	}

}
