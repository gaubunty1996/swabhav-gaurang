package com.techlabs.tictactoeunits;

public class ResultChecker {
	public CurrentGameState checkIfWon(Game game) {
		if ((checkIfFirstRowIsSame(game.gameboard)) || (checkIfSecondRowIsSame(game.gameboard))
				|| (checkIfThirdRowIsSame(game.gameboard)) || (checkIfFirstColumnIsSame(game.gameboard))
				|| (checkIfSecondColumnIsSame(game.gameboard)) || (checkIfThirdColumnIsSame(game.gameboard))
				|| (checkIfFirstDiagonalIsSame(game.gameboard)) || (checkIfSecondDiagonalIsSame(game.gameboard))) {
			return CurrentGameState.WIN;
		} else if (game.gameboard.checkIfFull()) {
			return CurrentGameState.DRAW;
		}
		return CurrentGameState.INPROGRESS;
	}

	public boolean checkIfFirstRowIsSame(Board gameboard) {
		if (gameboard.getMarkfromLocation(0) == Mark.CROSS && gameboard.getMarkfromLocation(1) == Mark.CROSS
				&& gameboard.getMarkfromLocation(2) == Mark.CROSS
				|| gameboard.getMarkfromLocation(0) == Mark.NOUGHT && gameboard.getMarkfromLocation(1) == Mark.NOUGHT
						&& gameboard.getMarkfromLocation(2) == Mark.NOUGHT) {
			return true;
		}
		return false;
	}

	public boolean checkIfSecondRowIsSame(Board gameboard) {
		if (gameboard.getMarkfromLocation(3) == Mark.CROSS && gameboard.getMarkfromLocation(4) == Mark.CROSS
				&& gameboard.getMarkfromLocation(5) == Mark.CROSS
				|| gameboard.getMarkfromLocation(3) == Mark.NOUGHT && gameboard.getMarkfromLocation(4) == Mark.NOUGHT
						&& gameboard.getMarkfromLocation(5) == Mark.NOUGHT) {
			return true;
		}
		return false;
	}

	public boolean checkIfThirdRowIsSame(Board gameboard) {
		if (gameboard.getMarkfromLocation(6) == Mark.CROSS && gameboard.getMarkfromLocation(7) == Mark.CROSS
				&& gameboard.getMarkfromLocation(8) == Mark.CROSS
				|| gameboard.getMarkfromLocation(6) == Mark.NOUGHT && gameboard.getMarkfromLocation(7) == Mark.NOUGHT
						&& gameboard.getMarkfromLocation(8) == Mark.NOUGHT) {
			return true;
		}
		return false;
	}

	public boolean checkIfFirstColumnIsSame(Board gameboard) {
		if (gameboard.getMarkfromLocation(0) == Mark.CROSS && gameboard.getMarkfromLocation(3) == Mark.CROSS
				&& gameboard.getMarkfromLocation(6) == Mark.CROSS
				|| gameboard.getMarkfromLocation(0) == Mark.NOUGHT && gameboard.getMarkfromLocation(3) == Mark.NOUGHT
						&& gameboard.getMarkfromLocation(6) == Mark.NOUGHT) {
			return true;
		}
		return false;
	}

	public boolean checkIfSecondColumnIsSame(Board gameboard) {
		if (gameboard.getMarkfromLocation(1) == Mark.CROSS && gameboard.getMarkfromLocation(4) == Mark.CROSS
				&& gameboard.getMarkfromLocation(7) == Mark.CROSS
				|| gameboard.getMarkfromLocation(1) == Mark.NOUGHT && gameboard.getMarkfromLocation(4) == Mark.NOUGHT
						&& gameboard.getMarkfromLocation(7) == Mark.NOUGHT) {
			return true;
		}
		return false;
	}

	public boolean checkIfThirdColumnIsSame(Board gameboard) {
		if (gameboard.getMarkfromLocation(2) == Mark.CROSS && gameboard.getMarkfromLocation(5) == Mark.CROSS
				&& gameboard.getMarkfromLocation(8) == Mark.CROSS
				|| gameboard.getMarkfromLocation(2) == Mark.NOUGHT && gameboard.getMarkfromLocation(5) == Mark.NOUGHT
						&& gameboard.getMarkfromLocation(8) == Mark.NOUGHT) {
			return true;
		}
		return false;
	}

	public boolean checkIfFirstDiagonalIsSame(Board gameboard) {
		if (gameboard.getMarkfromLocation(0) == Mark.CROSS && gameboard.getMarkfromLocation(4) == Mark.CROSS
				&& gameboard.getMarkfromLocation(8) == Mark.CROSS
				|| gameboard.getMarkfromLocation(0) == Mark.NOUGHT && gameboard.getMarkfromLocation(4) == Mark.NOUGHT
						&& gameboard.getMarkfromLocation(8) == Mark.NOUGHT) {
			return true;
		}
		return false;
	}

	public boolean checkIfSecondDiagonalIsSame(Board gameboard) {
		if (gameboard.getMarkfromLocation(2) == Mark.CROSS && gameboard.getMarkfromLocation(4) == Mark.CROSS
				&& gameboard.getMarkfromLocation(6) == Mark.CROSS
				|| gameboard.getMarkfromLocation(2) == Mark.NOUGHT && gameboard.getMarkfromLocation(4) == Mark.NOUGHT
						&& gameboard.getMarkfromLocation(6) == Mark.NOUGHT) {
			return true;
		}
		return false;
	}
}
