package com.techlabs.codemagnets;

class Drumkit {

	boolean topHat = true;
	boolean snare = true;

	void playTopHat() {
		System.out.println("ding ding da-ding");
	}

	void playSnare() {
		System.out.println("bang bang ba-bang");
	}

}

public class DrumKitTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drumkit d = new Drumkit();

		if (d.snare == true) {
			d.playSnare();
		}
		if (d.topHat == true) {
			d.playTopHat();
		}
	}

}
