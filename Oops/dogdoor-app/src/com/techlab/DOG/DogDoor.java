package com.techlab.DOG;

public class DogDoor {
	private boolean currentDoorState;

	public DogDoor(boolean state){
		this.currentDoorState=state;
	}
	public DogDoor(){
		this(false);
	}
	public boolean getCurrentDoorState(){
		return this.currentDoorState;
	}
	public void openDoor(){
		this.currentDoorState=true;
		System.out.println("The door is opened");
	}
	public void closeDoor(){
		this.currentDoorState=false;
		System.out.println("The door is closed");	
	}
}
