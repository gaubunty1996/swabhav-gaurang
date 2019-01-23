package com.techlab.DOG;

public class BarkRecognizer {
	private DogDoor door;

	/**
	 * @param door
	 */
	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}
	public void recognize(String bark) {
	    System.out.println("   BarkRecognizer: Heard a '" +bark + "'");
	    door.openDoor();
}

}
