package com.techlabs.guitar.project;

public class Guitar {
	private String serialNumber, builder, model, type, backwood, topwood;
	private double price;
	private GuitarSpecs specs; 
	
	public Guitar(String serialNumber,double price,Builder builder,String model,Type type,Wood backwood, Wood topwood) {
		this.serialNumber=serialNumber;
		this.price=price;
		this.specs = new GuitarSpecs(builder, model, type, backwood, topwood);
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}
	
	public double getPrice() {
		return price;
	}
	
	public GuitarSpecs getSpec() {
		return specs;
}
}
