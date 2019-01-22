package com.techlab.testDOG;

import com.techlab.DOG.DogDoor;
import com.techlab.DOG.Remote;

public class DogSimulator {

	public static void main(String[] args) {
		DogDoor dogDoor = new DogDoor();
		Remote remote = new Remote(dogDoor);
		System.out.println("Dog is barking, it seems that it wants to go outside");
		remote.pressButton();
		System.out.println("Dog has gone outside");
		
		try {
			Thread.currentThread().sleep(10000);
		}
		catch(Exception e) {
			System.out.println("door closed befor dog has done with its buisness..");
			System.out.println("Dog wants to go inside, so dog starts basrking");
			System.out.println("Someone at home grabs remote and presses button");
			remote.pressButton();
			System.out.println("Dog is inside");
		}
	}

}
