package com.techlab.readcsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReadCsv {

	public static void main(String[] args) throws IOException {
		
		Map<String, String> hashmap = new HashMap<String, String>();
		
		String fileName = "C:\\Users\\gaurang\\Desktop\\read.csv";
		File file = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null) {
			st=st.toLowerCase();
			String[] names=st.split(",");
			for(int i=0;i<names.length;i++) {
				hashmap.put(names[0].trim(), names[1].trim());
			}
			System.out.println(Arrays.toString(names));
		}
		System.out.println("\n");
		br.close();
		System.out.println(hashmap);
	}

}
