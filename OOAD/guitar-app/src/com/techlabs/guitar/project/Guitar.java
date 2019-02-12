package com.techlabs.guitar.project;

public class Guitar {
	private String serialNumber, builder, model, type, backwood, topwood;
	private double price;
	private GuitarSpecs specs; 
	
	public Guitar(String serialNumber,double price,GuitarSpecs specs) {
		this.serialNumber=serialNumber;
		this.price=price;
		this.specs = specs;
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
