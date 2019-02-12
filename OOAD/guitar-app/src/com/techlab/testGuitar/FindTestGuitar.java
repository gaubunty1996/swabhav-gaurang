package com.techlab.testGuitar;

import com.techlabs.guitar.project.Builder;
import com.techlabs.guitar.project.GuitarSpecs;
import com.techlabs.guitar.project.Inventory;
import com.techlabs.guitar.project.Type;
import com.techlabs.guitar.project.Wood;

public class FindTestGuitar {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		System.out.println(inventory.guitarlist1);
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("11277", 3999.95,
				new GuitarSpecs(Builder.COLLINGNS, "CJ", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.SITKA));
		inventory.addGuitar("V95693", 1499.95,
				new GuitarSpecs(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER));
		inventory.addGuitar("V9512", 1549.95,
				new GuitarSpecs(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER));
		inventory.addGuitar("122784", 5495.95,
				new GuitarSpecs(Builder.MARTIN, "D-18", Type.ACOUSTIC, Wood.MAHOGANY, Wood.ADIRONDACK));
		inventory.addGuitar("76531", 6295.95,
				new GuitarSpecs(Builder.MARTIN, "OM-28", Type.ACOUSTIC, Wood.BRAZILIAN_ROSEWOOD, Wood.ADIRONDACK));
		inventory.addGuitar("70108276", 2295.95,
				new GuitarSpecs(Builder.GIBSON, "Les Paul", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY));
		inventory.addGuitar("82765501", 1890.95,
				new GuitarSpecs(Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY));

	}

}
