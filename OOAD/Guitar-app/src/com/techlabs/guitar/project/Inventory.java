package com.techlabs.guitar.project;

import java.lang.reflect.Array;
import java.util.*;

public class Inventory {
	public ArrayList<Guitar> guitarlist1 = new ArrayList<Guitar>();

	public void addGuitar(String serialNumber, double price, GuitarSpecs specs) {
		Guitar guitar = new Guitar(serialNumber, price,specs);
		guitarlist1.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator i = guitarlist1.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialNumber().equals(serialNumber))
				return guitar;
		}
		return null;
	}
	
	public List search(GuitarSpecs searchSpec) {
		List matchingGuitars = new LinkedList();
		for (Iterator i = guitarlist1.iterator(); i.hasNext(); ) {
			Guitar guitar = (Guitar)i.next();
			if (guitar.getSpec().matches(searchSpec)){
				matchingGuitars.add(guitar);
			}				
		}
		return matchingGuitars;
}

}
