package com.techlab.set;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet<Integer>();
		hashset.add(10);// create
		hashset.add(20);
		hashset.add(30);
		System.out.println(hashset);// read
		hashset.add(20);// ignore duplicate
		System.out.println(hashset);
		hashset.remove(20);// delete
		System.out.println(hashset);
	}

}
