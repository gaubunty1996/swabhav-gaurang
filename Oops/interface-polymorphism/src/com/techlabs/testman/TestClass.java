package com.techlabs.testman;

import com.techlabs.man.Boy;
import com.techlabs.man.IEmotional;
import com.techlabs.man.IMannerable;
import com.techlabs.man.Man;

public class TestClass {

	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy();
		atTheMovies(boy);
		atTheParty(man);
		
	}
	public static void atTheParty(IMannerable imannerable) {
		System.out.println("at the party");
		imannerable.wish();
		imannerable.depart();
	}
	public static void atTheMovies(IEmotional iemotional) {
		System.out.println("at the movies");
		iemotional.cry();
		iemotional.laugh();
	}
	

}
