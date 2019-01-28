package com.techlabs.tictactoeunits;

public class ResultChecker implements IResultAnalyzer {
	/* (non-Javadoc)
	 * @see com.techlabs.tictactoeunits.IResultAnalyzer#checkIfWon(com.techlabs.tictactoeunits.Game)
	 */
	@Override
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

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoeunits.IResultAnalyzer#checkIfFirstRowIsSame(com.techlabs.tictactoeunits.IBoard)
	 */
	@Override
	public boolean checkIfFirstRowIsSame(IBoard gameboard) {
		if (gameboard.getMarkfromLocation(0) == Mark.CROSS && gameboard.getMarkfromLocation(1) == Mark.CROSS
				&& gameboard.getMarkfromLocation(2) == Mark.CROSS
				|| gameboard.getMarkfromLocation(0) == Mark.NOUGHT && gameboard.getMarkfromLocation(1) == Mark.NOUGHT
						&& gameboard.getMarkfromLocation(2) == Mark.NOUGHT) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoeunits.IResultAnalyzer#checkIfSecondRowIsSame(com.techlabs.tictactoeunits.IBoard)
	 */
	@Override
	public boolean checkIfSecondRowIsSame(IBoard gameboard) {
		if (gameboard.getMarkfromLocation(3) == Mark.CROSS && gameboard.getMarkfromLocation(4) == Mark.CROSS
				&& gameboard.getMarkfromLocation(5) == Mark.CROSS
				|| gameboard.getMarkfromLocation(3) == Mark.NOUGHT && gameboard.getMarkfromLocation(4) == Mark.NOUGHT
						&& gameboard.getMarkfromLocation(5) == Mark.NOUGHT) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoeunits.IResultAnalyzer#checkIfThirdRowIsSame(com.techlabs.tictactoeunits.IBoard)
	 */
	@Override
	public boolean checkIfThirdRowIsSame(IBoard gameboard) {
		if (gameboard.getMarkfromLocation(6) == Mark.CROSS && gameboard.getMarkfromLocation(7) == Mark.CROSS
				&& gameboard.getMarkfromLocation(8) == Mark.CROSS
				|| gameboard.getMarkfromLocation(6) == Mark.NOUGHT && gameboard.getMarkfromLocation(7) == Mark.NOUGHT
						&& gameboard.getMarkfromLocation(8) == Mark.NOUGHT) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoeunits.IResultAnalyzer#checkIfFirstColumnIsSame(com.techlabs.tictactoeunits.IBoard)
	 */
	@Override
	public boolean checkIfFirstColumnIsSame(IBoard gameboard) {
		if (gameboard.getMarkfromLocation(0) == Mark.CROSS && gameboard.getMarkfromLocation(3) == Mark.CROSS
				&& gameboard.getMarkfromLocation(6) == Mark.CROSS
				|| gameboard.getMarkfromLocation(0) == Mark.NOUGHT && gameboard.getMarkfromLocation(3) == Mark.NOUGHT
						&& gameboard.getMarkfromLocation(6) == Mark.NOUGHT) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoeunits.IResultAnalyzer#checkIfSecondColumnIsSame(com.techlabs.tictactoeunits.IBoard)
	 */
	@Override
	public boolean checkIfSecondColumnIsSame(IBoard gameboard) {
		if (gameboard.getMarkfromLocation(1) == Mark.CROSS && gameboard.getMarkfromLocation(4) == Mark.CROSS
				&& gameboard.getMarkfromLocation(7) == Mark.CROSS
				|| gameboard.getMarkfromLocation(1) == Mark.NOUGHT && gameboard.getMarkfromLocation(4) == Mark.NOUGHT
						&& gameboard.getMarkfromLocation(7) == Mark.NOUGHT) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoeunits.IResultAnalyzer#checkIfThirdColumnIsSame(com.techlabs.tictactoeunits.IBoard)
	 */
	@Override
	public boolean checkIfThirdColumnIsSame(IBoard gameboard) {
		if (gameboard.getMarkfromLocation(2) == Mark.CROSS && gameboard.getMarkfromLocation(5) == Mark.CROSS
				&& gameboard.getMarkfromLocation(8) == Mark.CROSS
				|| gameboard.getMarkfromLocation(2) == Mark.NOUGHT && gameboard.getMarkfromLocation(5) == Mark.NOUGHT
						&& gameboard.getMarkfromLocation(8) == Mark.NOUGHT) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoeunits.IResultAnalyzer#checkIfFirstDiagonalIsSame(com.techlabs.tictactoeunits.IBoard)
	 */
	@Override
	public boolean checkIfFirstDiagonalIsSame(IBoard gameboard) {
		if (gameboard.getMarkfromLocation(0) == Mark.CROSS && gameboard.getMarkfromLocation(4) == Mark.CROSS
				&& gameboard.getMarkfromLocation(8) == Mark.CROSS
				|| gameboard.getMarkfromLocation(0) == Mark.NOUGHT && gameboard.getMarkfromLocation(4) == Mark.NOUGHT
						&& gameboard.getMarkfromLocation(8) == Mark.NOUGHT) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoeunits.IResultAnalyzer#checkIfSecondDiagonalIsSame(com.techlabs.tictactoeunits.IBoard)
	 */
	@Override
	public boolean checkIfSecondDiagonalIsSame(IBoard gameboard) {
		if (gameboard.getMarkfromLocation(2) == Mark.CROSS && gameboard.getMarkfromLocation(4) == Mark.CROSS
				&& gameboard.getMarkfromLocation(6) == Mark.CROSS
				|| gameboard.getMarkfromLocation(2) == Mark.NOUGHT && gameboard.getMarkfromLocation(4) == Mark.NOUGHT
						&& gameboard.getMarkfromLocation(6) == Mark.NOUGHT) {
			return true;
		}
		return false;
	}
}
