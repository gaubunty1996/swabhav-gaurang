package com.techlab.csv;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class GenerationTester {

	public static void main(String[] args) throws IOException {
		Map<String, String> map = new TreeMap<String, String>();
		GenerateCsv generate = new GenerateCsv();
		generate.generateCsvFile(map);
		
	}

}
