package com.techlabs.guitar.project;

public enum Type {
	ACCOUSTICS, ELECTRIC;

	public String toString() {
		switch (this) {
		case ACCOUSTICS:
			return "accoustics";

		case ELECTRIC:
			return "electric";
		default :
			return "null";	
		}
	}
}
