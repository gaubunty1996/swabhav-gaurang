package com.techlab.list;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(10); // create
		linkedlist.add(20);
		linkedlist.add(30);
		System.out.println(linkedlist+"\nAfter updating");
		linkedlist.set(1, 30); //update
		System.out.println(linkedlist);//read
		linkedlist.remove(2);//delete
		System.out.println("after Deleting\n"+linkedlist);
		linkedlist.addFirst(20); // not in Arraylist
		linkedlist.offer(30); // not in Arraylist
System.out.println(linkedlist);
	}

}
