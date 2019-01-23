package com.packagecreater;
import java.util.*;  
import java.io.*;  
public class CreatePackage {

	public static void main(String[] args) throws Exception{
		Properties p=new Properties();  
		p.setProperty("name","Sonoo Jaiswal");  
		p.setProperty("email","sonoojaiswal@javatpoint.com");  
		  
		p.store(new FileWriter("details.properties"),"Property creation Example");  
	}

}
