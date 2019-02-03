package com.test.techlab.launching.layer;

import java.io.IOException;
import java.util.Scanner;

import com.techlab.buissness.layer.Bookmark;
import com.techlab.service.layer.BookmarkManager;
import com.techlab.service.layer.BookmarkServiceProvider;
import com.techlab.service.layer.IBookmarkServiceProvider;

public class BookmarkLauncher {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Bookmark bookmark = new Bookmark();
		IBookmarkServiceProvider bsp = new BookmarkServiceProvider();
		IBookmarkServiceProvider bookmarkManager= new BookmarkManager();
		boolean wantToExit = true;
		while (wantToExit) {

			System.out.println("If you want to add bookmark, press add: ");
			System.out.println("If you want to view bookmark, press view: ");
			System.out.println("If you want to export bookmark, press export: ");
			System.out.println("If you want to exit, press exit: ");
			String input = sc.next();
			input = input.toLowerCase();
			
			switch (input) {
			
			case ("add"):
				String name = getWebsiteName();
				String url = getUrlName();
				bookmark.callToAdd(name, url);
				System.out.println("website's name is : " + bookmark.getNameOfWebsite());
				System.out.println("url is : " + bookmark.getUrlOfWebsite());
				bsp.addBookmark(bookmark.getNameOfWebsite(), bookmark.getUrlOfWebsite());
				//bookmarkManager.addBookmark(getWebsiteName(), getUrlName());
				break;
			
			case ("view"):
				bsp.displayBookmark();
				break;
			
			case ("export"):
				String defaultDirectory = getCustomFilePath();
				String customFileName = getCustomFileName();
				bsp.exportBookmarks(defaultDirectory, customFileName);
				break;
			
			case ("exit"):
				wantToExit = false;
				break;
			}

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
