package com.techlab.readcsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ReadCsv {
	public static Map<String, String> hashmap = new HashMap<String, String>();
	public static Map<String, String> treemap;
	public static List list;

	public static void main(String[] args) throws IOException {
		String fileName = "C:\\Users\\gaurang\\Desktop\\read.csv";
		csvFileReader(fileName);
		System.out.println(hashmap);
		treemap = new TreeMap<>(hashmap);
		System.out.println(treemap);

		Set<Entry<String, String>> mappings = treemap.entrySet();
		sortByKeyName(mappings);
		sortByValueName(hashmap);
		System.out.println(list);
	}

	public static void csvFileReader(String fileName) throws IOException {

		File file = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null) {
			st = st.toLowerCase();
			String[] names = st.split(",");
			addDataInHashMap(names);
			// System.out.println(Arrays.toString(names));
		}
		System.out.println("\n");
		br.close();
	}

	public static void addDataInHashMap(String[] names) {
		for (int i = 0; i < names.length; i++) {
			hashmap.put(names[0].trim(), names[1].trim());
		}

	}

	public static void sortByKeyName(Set<Entry<String, String>> mappings) {
		mappings = treemap.entrySet();

		System.out.println("HashMap after sorting by keys in ascending order ");
		for (Entry<String, String> mapping : mappings) {
			System.out.println(mapping.getKey() + " ==> " + mapping.getValue());
		}
	}

	public static void sortByValueName(Map<String, String> map) {
		list = new ArrayList(map.entrySet());

		Collections.sort(list, new Comparator() {
			public int compare(Object obj1, Object obj2) {
				return ((Comparable) ((Map.Entry) (obj1)).getValue()).compareTo(((Map.Entry) (obj2)).getValue());
			}
		});
	}

}
