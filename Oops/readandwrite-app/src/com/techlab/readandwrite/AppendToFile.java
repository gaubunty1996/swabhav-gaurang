package com.techlab.readandwrite;

import java.io.*;
import java.util.*;

public class AppendToFile {

	public static void main(String[] args) throws IOException {
		String greet = "Hello fellow reader !";
		File file = new File("C:\\Users\\gaurang\\Desktop\\img.txt");
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
		writer.append(' ');
		writer.append(greet);
		writer.close();
	}

}
