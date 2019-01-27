package com.techlabs.tictactoeunits;

import java.util.Arrays;
import java.util.Scanner;

public class Console {
	public static void main(String[] args) throws Exception {
		ResultChecker resultchecker = new ResultChecker();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter player1's name:");
		String player1Name = scanner.nextLine();
		Player player1 = new Player(player1Name);
		System.out.println("\n");

		System.out.println("Enter player2's name:");
		String player2Name = scanner.nextLine();
		Player player2 = new Player(player2Name);
		System.out.println("\n");
		
		Game game = new Game(player1, player2, resultchecker);
		System.out.println();
		System.out.println(game.play(0));
		System.out.println(game.play(8));
		System.out.println(game.play(2));
		System.out.println(game.play(7));
		System.out.println(game.play(1)+"\n");
		printBoard(game.gameboard);
	}

	public static void printBoard(Board gameboard) {
		System.out.println(gameboard.getMarkfromLocation(0) + " | " + gameboard.getMarkfromLocation(1) + " | "
				+ gameboard.getMarkfromLocation(2));
		System.out.println("_____________________");
		System.out.println(gameboard.getMarkfromLocation(3) + " | " + gameboard.getMarkfromLocation(4) + " | "
				+ gameboard.getMarkfromLocation(5));
		System.out.println("_____________________");
		System.out.println(gameboard.getMarkfromLocation(6) + " | " + gameboard.getMarkfromLocation(7) + " | "
				+ gameboard.getMarkfromLocation(8));
	}
}
