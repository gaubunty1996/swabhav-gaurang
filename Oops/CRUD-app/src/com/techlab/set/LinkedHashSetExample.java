package com.techlab.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.add(10);// create
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		System.out.println(linkedHashSet);// read
		linkedHashSet.remove(20);// delete
		System.out.println(linkedHashSet);
	}

}
