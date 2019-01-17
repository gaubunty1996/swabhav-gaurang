package com.techlab.customreadwriteappendmethods;

public class ReadFile {
	static public String fileName = "C:\\Users\\gaurang\\Desktop\\assignment.html";

	public void readCustomFile(String newFileName) {
		fileCheckIfTextFile(newFileName);
		fileCheckIfHtmlFile(newFileName);
	}

	static public void fileCheckIfTextFile(String checkFileName) {
		if (checkFileName.endsWith(".txt")) {
			fileName = checkFileName;
		}
	
	}
	static public void fileCheckIfHtmlFile(String checkFileName) {
		if (checkFileName.endsWith(".html")) {
			fileName = checkFileName;
		}
	
	}
}
