package com.techlab.practicecompositepattern;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileLoader {
	private String fileName;
	private ArrayList<String> list = new ArrayList<String>();

	public FileLoader(String newFilename) {
		this.fileName = newFilename;
	}

	public ArrayList<String> loadFile() throws IOException, FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		String line;
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();
		return list;
	}

	public String getFileName() {
		return fileName;
	}

	public ArrayList<String> getList() {
		return list;
	}

}