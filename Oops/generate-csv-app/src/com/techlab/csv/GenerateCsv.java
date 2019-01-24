package com.techlab.csv;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GenerateCsv {

	public static void generateCsvFile(Map<String, String> map) throws IOException {
		map.put("Maharashtra", "Mumbai");
		map.put("WestBengal", "Kolkatta");
		map.put("Maharashtra", "Mumbai");
		map.put(" sidko", "Mumbai");// will not append
		map.put("sidko ", " Mumbai");// will not append
		System.out.println(map);

		File file = new File("C:\\Users\\gaurang\\Desktop\\generatedcsv.csv");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, false));

		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			if (!key.startsWith(" ")&(!key.endsWith(" "))) {
				writer.append(key);
				writer.append(",");
				writer.append(value);
				writer.append("\n");
			}
		}
		writer.close();
	}
}
