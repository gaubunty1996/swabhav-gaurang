package com.techlabs.tictactoeunits;

import java.lang.invoke.SwitchPoint;

public class Game {
	public static IBoard gameboard = new Board();
	private Player player1;
	private Player player2;
	private Player currentPlayer;
	private Player otherPlayer;
	private CurrentGameState currentstate = CurrentGameState.NOTSTARTED;
	private IResultAnalyzer resultchecker;

	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		this.currentPlayer = player1;
		this.otherPlayer = player2;
	}

	public Game(Player player1, Player player2, IResultAnalyzer resultchecker) {
		super();
		this.player1 = player1;
		this.player2 = player2;
		this.currentPlayer = player1;
		this.otherPlayer = player2;
		this.resultchecker = resultchecker;
	}

	public static IBoard getGameboard() {
		return gameboard;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(Player currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public Player getOtherPlayer() {
		return otherPlayer;
	}

	public void setOtherPlayer(Player otherPlayer) {
		this.otherPlayer = otherPlayer;
	}

	public void switchThePlayer() {
		if (getCurrentPlayer() == player1) {
			setCurrentPlayer(player2);
			setOtherPlayer(player1);
			return;
		}
		setCurrentPlayer(player1);
		setOtherPlayer(player2);
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

		if ((gameboard.isCellEmpty(position))) {
			gameboard.setMarkatCustomLocation(position, getMark());
			switchThePlayer();
			this.currentstate = resultchecker.checkIfWon(this);
			return resultchecker.checkIfWon(this);
		}

		this.currentstate = CurrentGameState.DUPLICATE_NUMBER;
		return currentstate;
	}

	public CurrentGameState getCurrentstate() {
		return currentstate;
	}

}
