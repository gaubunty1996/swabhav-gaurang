package com.techlabs.dog;

import com.techlabs.dogs.Bark;
import com.techlabs.dogs.BarkRecognizer;
import com.techlabs.dogs.DogDoor;
import com.techlabs.dogs.Remote;

public class DogDoorSimulator {

	public static void main(String[] args) {
		
			DogDoor door = new DogDoor();
			door.addAllowedBark(new Bark("rowlf"));
			door.addAllowedBark(new Bark("rooowlf"));
			door.addAllowedBark(new Bark("rawlf"));
			door.addAllowedBark(new Bark("woof"));
			BarkRecognizer recognizer = new BarkRecognizer(door);
			Remote remote = new Remote(door);

			// Simulate the hardware hearing a bark
			System.out.println("Bruce starts barking.");
			recognizer.recognize(new Bark("Rowlf"));

			System.out.println("\nBruce has gone outside...");

			try {
				Thread.currentThread().sleep(10000);
			} catch (InterruptedException e) {
			}

			System.out.println("\nBruce all done...");
			System.out.println("...but he's stuck outside!");

			Bark smallDogBark = new Bark("yip");
			System.out.println("A small dog starts barking.");
			recognizer.recognize(smallDogBark);

			try {
				Thread.currentThread().sleep(5000);
			} catch (InterruptedException e) {
			}

			System.out.println("\nBruce starts barking.");
			recognizer.recognize(new Bark("Rowlf"));

			System.out.println("\nBruce's back inside...");

	}
	}


