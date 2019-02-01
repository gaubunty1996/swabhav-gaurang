package com.techlab.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IDiskItem {
	private String name;
	private List<IDiskItem> items;

	public Folder(String name) {
		super();
		this.name = name;
		this.items = new ArrayList<IDiskItem>();
	}

	public void addItem(IDiskItem disk) {
		items.add(disk);
	}

	@Override
	public void display() {
		/*System.out.println(this.name);
		for (IDiskItem item : items) {
			item.display();
		}*/
		System.out.println(TestIdiskSystem.compositeBuilder + "Folder: "
				+ getName());
		TestIdiskSystem.compositeBuilder.append("      ");
		for (IDiskItem e : items) {
			String name = e.getClass().getSimpleName();
			if (name.equals("Folder")) {

				((Folder) e).display();
			} else {
				((File) e).display();
			}
			TestIdiskSystem.compositeBuilder.setLength(TestIdiskSystem.compositeBuilder
					.length() - 3);
}
	}

	public String getName() {
		return name;
	}

	public List<IDiskItem> getItems() {
		return items;
	}

}
