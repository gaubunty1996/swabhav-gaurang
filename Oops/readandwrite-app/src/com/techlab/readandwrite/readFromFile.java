package com.techlab.readandwrite;

import java.io.*;
import java.util.*;

public class readFromFile {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\gaurang\\Desktop\\img.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null) {
			System.out.println(st);
		}
		br.close();

	}

}
