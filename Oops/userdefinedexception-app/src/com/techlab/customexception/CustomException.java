package com.techlab.customexception;

public class CustomException extends Exception {
	private String name;

	public CustomException(String customName) {
		this.name = customName;
	}

	@Override
	public String toString() {
		return (name);
	}
}
