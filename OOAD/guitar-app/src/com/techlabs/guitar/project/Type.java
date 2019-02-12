package com.techlabs.guitar.project;

public enum Type {
 ELECTRIC, ACOUSTIC;

	public String toString() {
		switch (this) {
		case ACOUSTIC:
			return "accoustics";

		case ELECTRIC:
			return "electric";
		default :
			return "null";	
		}
	}
}
