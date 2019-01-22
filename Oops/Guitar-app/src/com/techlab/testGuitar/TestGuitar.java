package com.techlab.testGuitar;

import com.techlabs.guitar.project.Builder;
import com.techlabs.guitar.project.Inventory;
import com.techlabs.guitar.project.Type;
import com.techlabs.guitar.project.Wood;

public class TestGuitar {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		inventory.addGuitar("123", 55.89, Builder.FENDER, "HarleyDavidson", Type.ELECTRIC, Wood.ADIRONDACK, Wood.ALDER);
		System.out.println(inventory.getGuitar("123"));
		inventory.addGuitar("321", 88.22, Builder.FENDER, "Davidson", Type.ELECTRIC, Wood.ADIRONDACK, Wood.ALDER);
		System.out.println(inventory.getGuitar("321"));
	}

}
