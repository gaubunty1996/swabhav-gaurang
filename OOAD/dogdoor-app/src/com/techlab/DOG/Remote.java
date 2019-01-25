package com.techlab.DOG;

import java.util.*;

public class Remote {
	private DogDoor door;

	public Remote(DogDoor door){
		this.door = door;
	}
	public void pressButton(){
		System.out.println("Pressin the button");
		if(door.getCurrentDoorState()==true){
			door.closeDoor();
		}
		else{
			door.openDoor();
			final Timer timer =new Timer();
			timer.schedule(new TimerTask(){
				public void run(){
					door.closeDoor();
					timer.cancel();
				}
			},5000);
		}
	}
}
