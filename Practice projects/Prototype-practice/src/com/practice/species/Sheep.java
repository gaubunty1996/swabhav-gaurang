package com.practice.species;

public class Sheep implements Animal{
	private Sheep sheep;
	@Override
	public Animal makeCopy() {
		try {
			
		 sheep = (Sheep)super.clone();
		
		}catch(Exception e) {
			
		}
		return sheep;
	}
	public String toString() {
		return "sheep is eatable";
	}

}
