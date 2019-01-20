package com.test.techlab.launching.layer;

import java.io.IOException;
import java.util.Scanner;

import com.techlab.buissness.layer.Bookmark;
import com.techlab.service.layer.BookmarkServiceProvider;

public class BookmarkLauncher {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Bookmark bookmark = new Bookmark();
		BookmarkServiceProvider bsp = new BookmarkServiceProvider();

		System.out.println("If you want to add bookmark, press a: ");
		System.out.println("If you want to view bookmark, press v: ");
		System.out.println("If you want to export bookmark, press e: ");
		String input = sc.next();

		if (input.equalsIgnoreCase("a")) {
			String name = getWebsiteName();
			String url = getUrlName();
			bookmark.callToAdd(name, url);
			System.out.println("website's name is : " + bookmark.getNameOfWebsite());
			System.out.println("url is : " + bookmark.getUrlOfWebsite());
			bsp.addBookmark(bookmark.getNameOfWebsite(), bookmark.getUrlOfWebsite());
		}
		if (input.equalsIgnoreCase("v")) {
			bsp.displayBookmark();
		}
		if (input.equalsIgnoreCase("e")) {
			String defaultDirectory = getCustomFilePath();
			String customFileName = getCustomFileName();
			bsp.exportBookmarks(defaultDirectory, customFileName);
		}
	}

	public static String getWebsiteName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the website's name:");
		return sc.next();
	}

	public static String getUrlName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the url : ");
		return sc.next();
	}

	public static String getCustomFilePath() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter default file directory to save: ");
		return sc.nextLine();
	}

	public static String getCustomFileName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name: ");
		return sc.nextLine();
	}
}
