package com.techlabs.objcreation;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

import com.objectcreation.MyObject;

public class DifferentWaysToCreateObject {
	public String name="Gaurang";
	public static void main(String[] args)throws Exception,ClassNotFoundException,IOException,CloneNotSupportedException{
			DifferentWaysToCreateObject d = (DifferentWaysToCreateObject) Class.forName("com.techlabs.objcreation.DifferentWaysToCreateObject").newInstance();
			System.out.println(d.name);
			DifferentWaysToCreateObject d1 = new DifferentWaysToCreateObject();
			DifferentWaysToCreateObject d2 = d1;
			System.out.println(d2.name);
			//DifferentWaysToCreateObject d3 = (DifferentWaysToCreateObject) d1.clone();
			//System.out.println(d3.name);
		}
	}

