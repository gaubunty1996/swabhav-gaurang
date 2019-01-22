package com.techlab.crud;
import com.techlab.crud.ICrudable;

public class CustomerDB implements ICrudable {

	@Override
	public void create() {
		System.out.println("CustomerDB created");
	}

	@Override
	public void read() {
		System.out.println("CustomerDB is been readed");
	}

	@Override
	public void update() {
		System.out.println("CustomerDB is been updated");
	}

	@Override
	public void delete() {
		System.out.println("CustomerDB is been deleted");
	}

}
