package com.test.techlab.launching.layer;

import java.io.IOException;
import java.util.Scanner;

import com.techlab.buissness.layer.Bookmark;
import com.techlab.service.layer.BookmarkServiceProvider;

public class BookmarkLauncher {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Bookmark bookmark = new Bookmark();
		BookmarkServiceProvider bsp=new BookmarkServiceProvider();

		System.out.println("If you want to add bookmark, press a: ");
		System.out.println("If you want to view bookmark, press v: ");
		System.out.println("If you want to keep surfing, press s: ");

		String input = sc.next();
		input = input.toLowerCase();

		if (input.equalsIgnoreCase("a")) {
			System.out.println("Enter the website's name:");
			String name = sc.next();
			System.out.println("Enter the website's url:");
			String url = sc.next();
			
			bookmark.callToAdd(name, url);
			System.out.println("website's name is : " + bookmark.getNameOfWebsite());
			System.out.println("url is : " + bookmark.getUrlOfWebsite());
			bsp.addBookmark(bookmark.getNameOfWebsite(), bookmark.getUrlOfWebsite());
		}
		if(input.equalsIgnoreCase("v")) {
			bsp.DisplayBookmark();
		}
	}
}
