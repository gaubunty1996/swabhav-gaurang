package com.techlab.readandwrite;
import com.techlab.customreadwriteappendmethods.ReadFile;

import java.io.*;
import java.util.*;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		ReadFile rf= new ReadFile();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter custom path of the file you want to read:");
		String newFile=sc.nextLine();
		File file = new File(newFile);
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		while ((st = br.readLine()) != null) {
			System.out.println(st);
		}
		br.close();

	}

}
