package com.techlabs.tictactoeunits;

import java.util.ArrayList;
import java.util.List;

public class Board implements IBoard {
	private static Cell[] gameboard = new Cell[9];
	// private static List<Cell> board = new ArrayList(9);

	public Board() {
		for (int index = 0; index < gameboard.length; index++) {
			gameboard[index] = new Cell();
		}
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoeunits.IBoard#getBoard()
	 */
	@Override
	public Cell[] getBoard() {
		return gameboard;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoeunits.IBoard#checkIfFull()
	 */
	@Override
	public boolean checkIfFull() {
		for (int i = 0; i < gameboard.length; i++) {
			if (gameboard[i].getMark() == Mark.EMPTY) {
				return false;
			}
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoeunits.IBoard#checkIfEmpty()
	 */
	@Override
	public boolean checkIfEmpty() {
		for (int i = 0; i < gameboard.length; i++) {
			if (gameboard[i].getMark() == Mark.CROSS || gameboard[i].getMark() == Mark.NOUGHT) {
				return false;
			}
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoeunits.IBoard#setMarkatCustomLocation(int, com.techlabs.tictactoeunits.Mark)
	 */
	@Override
	public void setMarkatCustomLocation(int index, Mark mark) throws Exception {
		if (index < 0 || index > 8) {
			throw new RuntimeException("Please enter valid index position");
		}
		gameboard[index].setMark(mark);
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoeunits.IBoard#getMarkfromLocation(int)
	 */
	@Override
	public Mark getMarkfromLocation(int index) {
		if (index < 0 || index > 8) {
			throw new RuntimeException("Please enter valid index position");
		}

		return gameboard[index].getMark();
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoeunits.IBoard#getSizeOfBoard()
	 */
	@Override
	public int getSizeOfBoard() {
		return gameboard.length;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoeunits.IBoard#isCellEmpty(int)
	 */
	@Override
	public boolean isCellEmpty(int index) {
		if (getMarkfromLocation(index) == Mark.EMPTY) {
			return true;
		}
		return false;
	}

}
