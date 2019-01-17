package com.techlab.readandwrite;

import java.io.*;
import java.util.*;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		String greet = "Hello fellow reader !";
		File file = new File("C:\\Users\\gaurang\\Desktop\\example.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		writer.write(greet);

		writer.close();
	}

}
