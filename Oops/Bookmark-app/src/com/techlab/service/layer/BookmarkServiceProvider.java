package com.techlab.service.layer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.techlab.buissness.layer.Bookmark;

public class BookmarkServiceProvider {
	public void addBookmark(String name, String url) throws IOException {
		String fileName = "C:\\Users\\gaurang\\Desktop\\bookmark.html";
		File file = new File(fileName);
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
		writer.append("<a href=https://" + url + ">" + name + "</a>");
		writer.append("<br>");
		writer.close();
	}
	public void DisplayBookmark() throws IOException {
		String fileName = "C:\\Users\\gaurang\\Desktop\\bookmark.html";
		File file = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null) {
			System.out.println(st);
		}
		br.close();
	}
}
