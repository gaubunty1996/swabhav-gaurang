package com.techlab.testemployeedataanalyzer;

import java.io.IOException;
import java.net.MalformedURLException;

import com.techlab.employeedataanlayzer.DiskLoader;
import com.techlab.employeedataanlayzer.ILoader;
import com.techlab.employeedataanlayzer.UrlLoader;

public class TestUrlLoading {
	public static void main(String[] args) throws MalformedURLException, IOException {
		ILoader iloader =  new UrlLoader();
		System.out.println(iloader.load());
		ILoader diskloader =  new DiskLoader();
		System.out.println(diskloader.load());
	} 
}
