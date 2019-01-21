package com.techlab.man.test;

import com.techlabs.man.Man;
import com.techlabs.man.Boy;
import com.techlabs.man.Kid;
import com.techlabs.man.Infant;

public class TestMan {
	public static void case1() {
		Man man;
		man = new Man();
		man.eat();
		man.play();
		man.read();

	}

	public static void case2() {
		Boy boy;
		boy = new Boy();
		boy.eat();
		boy.read();
		boy.play();
		boy.walk();
	}

	public static void case3() {
		Man man1;
		man1 = new Boy();
		man1.play();
		man1.read();
		man1.eat();

	}

	public static void atThePark(Man man) {
		System.out.println("At the park");
		man.play();
	}

	public static void main(String[] args) {
		case1();
		System.out.println(" ");

		case2();
		System.out.println(" ");

		case3();
		System.out.println(" ");

		atThePark(new Man());
		System.out.println(" ");

		atThePark(new Boy());
		System.out.println(" ");

		atThePark(new Kid());
		System.out.println(" ");

		atThePark(new Infant());
		System.out.println(" ");
	}

}
