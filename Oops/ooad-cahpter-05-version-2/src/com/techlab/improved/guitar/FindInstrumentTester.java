package com.techlab.improved.guitar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.techlabs.enums.Builder;
import com.techlabs.enums.InstrumentType;
import com.techlabs.enums.Wood;

public class FindInstrumentTester {
	public static void main(String[] args) {
		// Set up Rick's inventory
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Map properties = new HashMap();
		properties.put("builder", Builder.GIBSON);
		properties.put("backWood", Wood.MAPLE);
		InstrumentSpec whatBryanLikes = new InstrumentSpec(properties);

		List matchingInstruments = inventory.search(whatBryanLikes);
		if (!matchingInstruments.isEmpty()) {
			System.out.println("Bryan, you might like these instruments:");
			for (Iterator i = matchingInstruments.iterator(); i.hasNext();) {
				Instrument instrument = (Instrument) i.next();
				InstrumentSpec spec = instrument.getSpec();
				System.out
						.println("We have a " + spec.getProperty("instrumentType") + " with the following properties:");
				for (Iterator j = spec.getProperties().keySet().iterator(); j.hasNext();) {
					String propertyName = (String) j.next();
					if (propertyName.equals("instrumentType"))
						continue;
					System.out.println("    " + propertyName + ": " + spec.getProperty(propertyName));
				}
				System.out.println("  You can have this " + spec.getProperty("instrumentType") + " for $"
						+ instrument.getPrice() + "\n---");
			}
		} else {
			System.out.println("Sorry, Bryan, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		Map properties = new HashMap();

		properties.put("builder", Builder.GIBSON);
		properties.put("model", "Les Paul");
		properties.put("topWood", Wood.MAPLE);
		properties.put("backWood", Wood.MAPLE);
		inventory.addInstrument("70108276", 2295.95, new InstrumentSpec(properties));

		properties.put("instrumentType", InstrumentType.BANJO);
		properties.put("model", "RB-3 Wreath");
		properties.remove("topWood");
		properties.put("numStrings", 5);
		inventory.addInstrument("8900231", 2945.95, new InstrumentSpec(properties));
	}

}
