package com.techlab.map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		treemap.put(1, "a");// create
		treemap.put(2, "b");
		treemap.put(3, "c");
		treemap.put(4, "0");
		System.out.println(treemap);// read
		treemap.replace(4, "d");// update
		System.out.println(treemap);
		treemap.remove(4);// delete
		System.out.println(treemap);
	}

}
