package com.techlab.employeedataanlayzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class DiskLoader implements ILoader {
	ArrayList<String> listofemployee = new ArrayList<String>();
	String newFilePath="C:\\Users\\gaurang\\Desktop\\dataFile.txt";
	@Override
	public ArrayList<String> load() throws IOException {
		StringBuilder content = new StringBuilder();
		BufferedReader br = new BufferedReader(new FileReader(new File(newFilePath)));
		String eachline;
		while ((eachline = br.readLine()) != null) {
			content.append(eachline + "\n");
			listofemployee.add(eachline);
		}
		return listofemployee;
	}
	
	
	

}
