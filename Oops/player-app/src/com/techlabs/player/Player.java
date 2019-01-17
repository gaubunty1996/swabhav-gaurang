package com.techlabs.player;

import com.techlabs.player.GenderOptions;;

public class Player {
	private String name;
	private int age;
	private GenderOptions genderoptions;

	public Player(String name) {
		// name=name;
		// age=18;
		// genderoptions=GenderOptions.MALE;
		this(name, 18, GenderOptions.MALE);
	}

	public Player(String name, int age, GenderOptions genderoptions) {
		this.name = name;
		this.age = age;
		this.genderoptions = genderoptions;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public GenderOptions getDetailsOfGenders() {
		return genderoptions;
	}

	public Player whoIsElder(Player player) {
		if (this.age > player.age) {
			return this;
		}
		return player;
	}

}
