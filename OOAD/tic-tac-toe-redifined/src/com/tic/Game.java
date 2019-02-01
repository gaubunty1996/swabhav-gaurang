package com.tic;

public class Game {
	private Player player1;
	private Player player2;
	private IResultAnalyizer resultAnalyizer;
	private IBoard board;
	private Player currentPlayer = player2;
	private boolean currentState = true;

	public Game(IResultAnalyizer resultAnalyizer, IBoard board, Player player1, Player player2) {
		this.resultAnalyizer = resultAnalyizer;
		this.board = board;
		this.player1 = player1;
		this.player2 = player2;
	}

	public Result play(int index) {
		if (currentState == true) {
			board.setCellMark(index, Mark.CROSS);
			resultAnalyizer.checkResult();
			if (resultAnalyizer.getResult() == Result.WIN) {
				return resultAnalyizer.getResult();
			}
			if (resultAnalyizer.getResult() == Result.DRAW) {
				return resultAnalyizer.getResult();
			}
		}
		if (currentState == false) {
			board.setCellMark(index, Mark.NOUGHT);
			resultAnalyizer.checkResult();
			if (resultAnalyizer.getResult() == Result.WIN) {
				return resultAnalyizer.getResult();
			}
			if (resultAnalyizer.getResult() == Result.DRAW) {
				return resultAnalyizer.getResult();
			}
		}
		switchPlayer();
		currentState = !currentState;
		return resultAnalyizer.getResult();

	}

	public void switchPlayer() {
		if (currentPlayer == player1) {
			currentPlayer = player2;
		} else {
			currentPlayer = player1;
		}
	}

	public Player getPlayer1() {
		return player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public IResultAnalyizer getResultAnalyizer() {
		return resultAnalyizer;
	}

	public IBoard getBoard() {
		return board;
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public boolean isCurrentState() {
		return currentState;
	}

}
