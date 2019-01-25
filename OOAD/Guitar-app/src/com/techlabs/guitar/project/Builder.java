package com.techlabs.guitar.project;

public enum Builder {

	FENDER, MARTIN, GIBSON, COLLINGNS, OLSEN, RYAN, PRS, ANY;
	public String toString() {
		switch (this) {
		case FENDER:
			return "fender";
		case MARTIN:
			return "martin";
		case GIBSON:
			return "gibson";
		case COLLINGNS:
			return "collingns";
		case OLSEN:
			return "olsen";
		case RYAN:
			return "ryan";
		case PRS:
			return "prs";
		case ANY:
			return "any";
		default :
			return "null";	
		}
	}
}
