package com.techlab.testCloning;

import com.techlab.prototype.Animal;
import com.techlab.prototype.CloneFactory;
import com.techlab.prototype.Tiger;

public class TestCloneFactory {

	public static void main(String[] args) {
		CloneFactory cloneFactory = new CloneFactory();

		// Creates a new Tiger instance
		Tiger rocky = new Tiger();

		// Creates a clone of Sally and stores it in its own memory location
		Tiger clonedTiger = (Tiger) cloneFactory.getClone(rocky);

		// These are exact copies of each other
		System.out.println(rocky);
		System.out.println(clonedTiger);
		System.out.println("Rocky's HashCode: " + System.identityHashCode(System.identityHashCode(rocky)));
		System.out.println("Cloned rocky's HashCode: " + System.identityHashCode(System.identityHashCode(clonedTiger)));
	}
}
