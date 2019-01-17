package com.serialization.techlab;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.techlabs.serialization.Student;;

public class TestSerialization {

	public static void main(String[] args) {
		Student s1=new Student("Gaurang",21,5.88);
		String fileName="C:\\Users\\gaurang\\Desktop\\ima.txt\\";
		try
		{ 
			//Saving of object in a file 
			FileOutputStream file = new FileOutputStream(fileName); 
			ObjectOutputStream out = new ObjectOutputStream(file); 
			
			// Method for serialization of object 
			out.writeObject(s1); 
			
			out.close(); 
			file.close(); 
			
			System.out.println("Object has been serialized"); 

		} 
		catch(IOException ex) 
		{ 
			System.out.println("IOException is caught"); 
		} 

		
	}

}
