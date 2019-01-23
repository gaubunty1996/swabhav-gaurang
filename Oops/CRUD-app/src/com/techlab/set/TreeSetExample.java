package com.techlab.set;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		treeset.add(10);// create
		treeset.add(20);
		treeset.add(30);
		System.out.println(treeset);// read
		treeset.remove(20);
		System.out.println(treeset);// delete
	}
}
