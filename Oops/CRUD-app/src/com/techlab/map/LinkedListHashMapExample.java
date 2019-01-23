package com.techlab.map;

import java.util.LinkedHashMap;

public class LinkedListHashMapExample {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> namelist = new LinkedHashMap<Integer, String>();
		namelist.put(1, "a");// create
		namelist.put(2, "b");
		namelist.put(3, "c");
		namelist.put(4, "0");
		System.out.println(namelist);// read
		namelist.replace(4, "d");// update
		System.out.println(namelist);
		namelist.remove(4);// delete
		System.out.println(namelist);
	}
	
}
