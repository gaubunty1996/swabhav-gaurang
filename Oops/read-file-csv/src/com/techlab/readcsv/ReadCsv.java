package com.techlab.readcsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsv {

	public static void main(String[] args) throws IOException {
		String fileName="C:\\Users\\gaurang\\Desktop\\read.csv";
		File file = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null) {
			System.out.println(st);
		}
		br.close();
	}

}
