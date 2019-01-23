package com.techlab.map;
import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "a");// create
		hashmap.put(2, "b");
		hashmap.put(3, "c");
		hashmap.put(4, "0");
		System.out.println(hashmap);// read
		hashmap.replace(4, "d");// update
		System.out.println(hashmap);
		hashmap.remove(4);// delete
		System.out.println(hashmap);
	}

}
