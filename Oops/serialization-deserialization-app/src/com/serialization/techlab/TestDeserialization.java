package com.serialization.techlab;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlabs.serialization.Student;;

public class TestDeserialization {

	public static void main(String[] args) {
		Student s2 = null;
		String fileName="C:\\Users\\gaurang\\Desktop\\ima.txt\\";
		// Deserialization
		try {
			// Reading the object from a file
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			s2 = (Student) in.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			System.out.println("name = " + s2.getName());
			System.out.println("cgpa = " + s2.getCgpa());
			System.out.println("roll no=  " + s2.getRollNo());
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}

	}

}
