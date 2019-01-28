package com.techlab.employeedataanlayzer;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.net.*;
import java.io.*;

public class UrlLoader implements ILoader {
	ArrayList<String> listofemployee = new ArrayList<String>();
	String newFilePath="https://swabhav-tech.firebaseapp.com/emp.txt";

	public ArrayList<String> load() throws IOException {
		StringBuilder content = new StringBuilder();
		URL url = new URL(newFilePath);
		URLConnection urlConnection = url.openConnection();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		String line;

		while ((line = bufferedReader.readLine()) != null) {
			content.append(line + "\n");
			listofemployee.add(line);
		}
		bufferedReader.close();
		return listofemployee;
		// return content.toString();

	}
}
