package com.techlabs.controllers;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
	public List<String> getBrand(String color) {
		List<String> brands = new ArrayList<>();
		if (color.equals("amber")) {
			brands.add("Jack Amber");
			brands.add("Red Moose");
		}
		else if(color.equals("light")) {
			brands.add("light beer");
			brands.add("appy");
		}
		else if(color.equals("brown")) {
			brands.add("strong beer");
			brands.add("Red beer");
		}
		else {
			brands.add("Jail pale Ale");
			brands.add("Gout stout");
		}
		return brands;
	}
}
