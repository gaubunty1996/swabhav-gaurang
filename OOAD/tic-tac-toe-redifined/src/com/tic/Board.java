package com.tic;


public class Board implements IBoard {
	private Cell[] cells = new Cell[9];

	public Board() {
		for (int index = 0; index < cells.length; index++) {
			cells[index] = new Cell();
		}
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoe.IBoard#isFull()
	 */
	@Override
	public boolean isFull() {
		for (int index = 0; index < 9; index++) {
			if (cells[index].getMark() == Mark.EMPTY) {
				return false;
			}
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoe.IBoard#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		for (int index = 0; index < 9; index++) {
			if (cells[index].getMark() == Mark.CROSS || cells[index].getMark() == Mark.NOUGHT) {
				return false;
			}
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoe.IBoard#setCellMark(int, com.techlabs.tictactoe.Mark)
	 */
	@Override
	public void setCellMark(int index, Mark mark) {
		cells[index].setMark(mark);
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoe.IBoard#getCellMark(int)
	 */
	@Override
	public Mark getCellMark(int index) {
		return cells[index].getMark();

	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoe.IBoard#getCells()
	 */
	@Override
	public Cell[] getCells() {
		return cells;
	}

}