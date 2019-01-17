package com.techlab.testplayer;

import com.techlabs.player.GenderOptions;
import com.techlabs.player.Player;

public class Test {

	static public void printDetails(Player player) {
		System.out.println("player's name" + player.getName());
		System.out.println("player's age" + player.getAge());
		System.out.println("player's Gender" + player.getDetailsOfGenders());
	}

	public static void main(String[] args) {
		Player p1 = new Player("sachin", 18, GenderOptions.MALE);
		Player p2 = new Player("virat");
		Player p3 = p1.whoIsElder(p2);
		// printDetails(p1);
		System.out.println(" ");
		printDetails(p3);

	}

}
