package com.techlabs.tictactoeunits;

import java.lang.invoke.SwitchPoint;

public class Game {
	public static Board gameboard = new Board();
	private Player player1;
	private Player player2;
	private Player currentPlayer;
	private CurrentGameState currentstate = CurrentGameState.NOTSTARTED;
	private ResultChecker resultchecker;

	public Game(Player player1, Player player2, ResultChecker resultchecker) {
		super();
		this.player1 = player1;
		this.player2 = player2;
		this.currentPlayer = player1;
		this.resultchecker = resultchecker;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public void switchThePlayer() {
		if (getCurrentPlayer() == player1) {
			setCurrentPlayer(player2);
			return;
		}
		setCurrentPlayer(player1);
		return;
	}

	public Mark getMark() {
		if (getCurrentPlayer().equals(player1)) {
			return Mark.CROSS;
		} else if (getCurrentPlayer().equals(player2)) {
			return Mark.NOUGHT;
		}
		return Mark.EMPTY;
	}

	public CurrentGameState play(int position) throws Exception {
		if (gameboard.isCellEmpty(position)) {
			gameboard.setMarkatCustomLocation(position, getMark());
			switchThePlayer();
			return resultchecker.checkIfWon(this);
		}
		return currentstate;

	}
}
