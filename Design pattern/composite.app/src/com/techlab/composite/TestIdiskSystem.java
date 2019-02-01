package com.techlab.composite;

public class TestIdiskSystem {
	public static StringBuffer compositeBuilder = new StringBuffer();
	public static void main(String[] args) {
		Folder folder = new Folder("Movies");
		File file = new File("abc", 30, ".avi");
		folder.addItem(file);
		
		Folder folder2 = new Folder("Hindi Movies");
		Folder folder3 = new Folder("English  Movies");
		folder.addItem(folder2);
		folder.addItem(folder3);
		
		File file2 = new File("lmn", 20, ".avi");
		Folder folder4 = new Folder("Comedy");
		folder2.addItem(file2);
		folder2.addItem(folder4);
		
		File file3 = new File("pqr", 30, ".avi");
		folder3.addItem(file3);
		
		File file4 = new File("xyz", 50, ".avi");
		folder4.addItem(file4);
		
		folder.display();
		

	}

}
