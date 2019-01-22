package com.techlabs.guitar.project;

import java.lang.reflect.Array;
import java.util.*;

public class Inventory {
	ArrayList<Guitar> guitarlist1 = new ArrayList<Guitar>();

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backwood,
			Wood topwood) {
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backwood, topwood);
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

}
