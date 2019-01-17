package com.techlabs.objcreation;
import java.io.InputStream;
import java.io.ObjectInputStream;

import com.objectcreation.MyObject;

public class DifferentWaysToCreateObject {
	public String name="Gaurang";
	public static void main(String[] args)throws Exception {
			DifferentWaysToCreateObject d = (DifferentWaysToCreateObject) Class.forName("com.techlabs.objcreation.DifferentWaysToCreateObject").newInstance();
			System.out.println(d.name);
		}
	}

