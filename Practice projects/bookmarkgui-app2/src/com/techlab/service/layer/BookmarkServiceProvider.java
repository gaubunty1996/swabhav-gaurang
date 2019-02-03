package com.techlab.service.layer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.techlab.buissness.layer.Bookmark;

public class BookmarkServiceProvider implements IBookmarkServiceProvider {
	static String fileName = "data\\bookmark.html";

	/* (non-Javadoc)
	 * @see com.techlab.service.layer.IBookmarkServiceProvider#addBookmark(java.lang.String, java.lang.String)
	 */
	@Override
	public void addBookmark(String name, String url) throws IOException {
		File file = new File(fileName);
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
		writer.append("<a href=https://" + url + ">" + name + "</a>");
		writer.append("<br>");
		writer.close();
	}

	/* (non-Javadoc)
	 * @see com.techlab.service.layer.IBookmarkServiceProvider#displayBookmark()
	 */
	@Override
	public void displayBookmark() throws IOException {
		File file = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null) {
			System.out.println(st);
		}
		br.close();
	}

	/* (non-Javadoc)
	 * @see com.techlab.service.layer.IBookmarkServiceProvider#exportBookmarks(java.lang.String, java.lang.String)
	 */
	@Override
	public void exportBookmarks(String defaultDirectory, String customFileName) throws IOException {
		String customFinalPath = defaultDirectory + "//" + customFileName + ".html";

		File customFile = new File(customFinalPath);
		File file = new File(fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));
		BufferedWriter writer = new BufferedWriter(new FileWriter(customFile, true));
		String st;
		while ((st = br.readLine()) != null) {
			writer.append(st);
			// writer.append("<br>");
		}
		writer.close();
		br.close();
		System.out.println("The exported new file is stored in :"+customFinalPath);
	}
}
