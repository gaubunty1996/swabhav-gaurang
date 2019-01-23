package com.packagecreater;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class AccessProperties {

	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader("details.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    System.out.println(p.getProperty("email"));  
	    System.out.println(p.getProperty("name"));  
	}

}
