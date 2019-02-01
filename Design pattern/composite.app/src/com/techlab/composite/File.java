package com.techlab.composite;

public class File implements IDiskItem {
	private String name;
	private int size;
	private String extension;

	public File(String name, int size, String extension) {
		super();
		this.name = name;
		this.size = size;
		this.extension = extension;
	}

	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

	public String getExtension() {
		return extension;
	}

	@Override
	public void display() {
		System.out.println(TestIdiskSystem.compositeBuilder + "File: " + this.getName() + " Extension: "
				+ this.getExtension() + " Size: " + this.getSize());
		// System.out.println(" "+this.name+""+this.extension+" " +this.size+"KB");
	}

}
