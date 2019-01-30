package com.teschlab.factory.method;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadPropertyFile {
	public String LoadProperty() {
		Properties prop = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream(
					"D:\\swabhav-repositry\\Design pattern\\factory-method-app\\src\\com\\teschlab\\factory\\method\\config.properties");
			prop.load(input);
			
			System.out.println(prop.getProperty("currentFactory").getClass());
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return prop.getProperty("currentFactory");
	}
}
