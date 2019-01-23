package com.techlab.list;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(10); //create
		arraylist.add(20);
		arraylist.add(30);
		System.out.println(arraylist+"\nAfter Updating");
		arraylist.set(1, 30); //update
		System.out.println(arraylist); //read
		arraylist.remove(1);  //delete
		System.out.println("After deleting");
System.out.println(arraylist);
	}

}
