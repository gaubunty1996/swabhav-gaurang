package com.techlab.prototype;

public class Tiger implements Animal {
	private Tiger tigerObj;

	public Tiger() {
		System.out.println("Tiger is been made....");
	}

	@Override
	public Animal makeCopy() {
		try {
			// Calls the Animal super classes clone()
			// Then casts the results to Tiger
			tigerObj = (Tiger) super.clone();
		}
		// If Animal didn't extend Cloneable this error is thrown

		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return tigerObj;
	}

	public String toString() {
		return "Tiger's name is: rocky";
	}
}
