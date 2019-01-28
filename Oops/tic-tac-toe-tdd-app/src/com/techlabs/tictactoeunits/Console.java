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
		startPlayingTheGame(game);
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

	public static void startPlayingTheGame(Game game) throws Exception {
		CurrentGameState state = game.getCurrentstate();
		System.out.println("Game's current status is :" + state);

		while (true) {
			if (state == CurrentGameState.NOTSTARTED || state == CurrentGameState.INPROGRESS) {
				System.out.println("Current status of game is: " + game.play(0));
				state = game.getCurrentstate();
			}
			if (state == CurrentGameState.INPROGRESS) {
				System.out.println("Current status of game is: " + game.play(8));
				state = game.getCurrentstate();
				if (state == CurrentGameState.DUPLICATE_NUMBER) {
					return;
				}
			}
			if (state == CurrentGameState.INPROGRESS) {
				System.out.println("Current status of game is: " + game.play(1));
				state = game.getCurrentstate();
			}
			if (state == CurrentGameState.INPROGRESS) {
				System.out.println("Current status of game is: " + game.play(7));
				state = game.getCurrentstate();
			}
			if (state == CurrentGameState.INPROGRESS) {
				System.out.println("Current status of game is: " + game.play(2));
				state = game.getCurrentstate();
				if (state == CurrentGameState.WIN) {
					System.out.println(game.getOtherPlayer().getName() + " Has won");
					return;
				}
			}
			if (state == CurrentGameState.INPROGRESS) {
				System.out.println("Current status of game is: " + game.play(6));
				state = game.getCurrentstate();
				if (state == CurrentGameState.WIN) {
					System.out.println(game.getOtherPlayer().getName() + " Has won");
					return;
				}

			}
			if (state == CurrentGameState.INPROGRESS) {
				System.out.println("Current status of game is: " + game.play(3));
				state = game.getCurrentstate();
				if (state == CurrentGameState.WIN) {
					System.out.println(game.getOtherPlayer().getName() + " Has won");
					return;
				}
			}
			if (state == CurrentGameState.INPROGRESS) {
				System.out.println("Current status of game is: " + game.play(5));
				state = game.getCurrentstate();
				if (state == CurrentGameState.WIN) {
					System.out.println(game.getOtherPlayer().getName() + " Has won");
					return;
				}
			}
			if (state == CurrentGameState.INPROGRESS) {
				System.out.println("Current status of game is: " + game.play(4));
				state = game.getCurrentstate();
				if (state == CurrentGameState.WIN) {
					System.out.println(game.getOtherPlayer().getName() + " Has won");
					return;
				} else if (state == CurrentGameState.DRAW) {
					System.out.println("Game is draw");
					return;
				}
			}
			return;

		}
	}
}