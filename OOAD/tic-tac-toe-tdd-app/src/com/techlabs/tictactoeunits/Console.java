package com.techlabs.tictactoeunits;

import java.util.Arrays;
import java.util.Scanner;

public class Console {
	public static void main(String[] args) throws Exception {
		IResultAnalyzer resultchecker = new ResultChecker();
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
		playTheGame(game);
		System.out.println("\n");
		printBoard(game.gameboard);
	}

	public static void printBoard(IBoard gameboard) {
		System.out.println(gameboard.getMarkfromLocation(0) + " | " + gameboard.getMarkfromLocation(1) + " | "
				+ gameboard.getMarkfromLocation(2));
		System.out.println("_____________________");
		System.out.println(gameboard.getMarkfromLocation(3) + " | " + gameboard.getMarkfromLocation(4) + " | "
				+ gameboard.getMarkfromLocation(5));
		System.out.println("_____________________");
		System.out.println(gameboard.getMarkfromLocation(6) + " | " + gameboard.getMarkfromLocation(7) + " | "
				+ gameboard.getMarkfromLocation(8));
	}

	public static void playTheGame(Game game) throws Exception {
		CurrentGameState state = game.getCurrentstate();
		System.out.println("Game's current status is :" + state);
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("\n");
			System.out.println("Enter index to play");
			int index = scanner.nextInt();

			if (state == CurrentGameState.NOTSTARTED || state == CurrentGameState.INPROGRESS) {
				try {
					System.out.println("Current status of game is: " + game.play(index));
				} catch (RuntimeException e) {
					System.out.println(e.getMessage());
				}
				state = game.getCurrentstate();
				if (state == CurrentGameState.WIN) {
					System.out.println(game.getOtherPlayer().getName() + " Has won");
					return;
				} else if (state == CurrentGameState.DRAW) {
					System.out.println("Game is draw");
					return;
				}

			}
			System.out.println("\n");
			printBoard(game.gameboard);
		}

	}
}