package com.tic;

public class ResultAnalyizer implements IResultAnalyizer {
	private Result result;
	private IBoard board;

	public ResultAnalyizer(IBoard board) {
		this.board = board;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoe.IResultAnalyizer#checkResult()
	 */
	@Override
	public Result checkResult() {
		if (isHorizontal() || isVertical() || isDiagonal()) {
			return result = Result.WIN;
		}
		if (board.isEmpty()) {
			return result = Result.NOTSTARTED;
		}
		if (board.isFull()) {
			return result = Result.DRAW;
		}
		if (result != Result.DRAW && result != Result.WIN && !board.isEmpty()) {
			return result = Result.INPROGRESS;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoe.IResultAnalyizer#isHorizontal()
	 */
	@Override
	public boolean isHorizontal() {
		if (Mark.EMPTY != board.getCellMark(0) && board.getCellMark(0) == board.getCellMark(1)
				&& board.getCellMark(1) == board.getCellMark(2)) {
			return true;
		}
		if (Mark.EMPTY != board.getCellMark(3) && board.getCellMark(3) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(5)) {
			return true;
		}
		if (Mark.EMPTY != board.getCellMark(6) && board.getCellMark(6) == board.getCellMark(7)
				&& board.getCellMark(7) == board.getCellMark(8)) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoe.IResultAnalyizer#isVertical()
	 */
	@Override
	public boolean isVertical() {
		if (Mark.EMPTY != board.getCellMark(0) && board.getCellMark(0) == board.getCellMark(3)
				&& board.getCellMark(3) == board.getCellMark(6)) {
			return true;
		}
		if (Mark.EMPTY != board.getCellMark(1) && board.getCellMark(1) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(7)) {
			return true;
		}
		if (Mark.EMPTY != board.getCellMark(2) && board.getCellMark(2) == board.getCellMark(5)
				&& board.getCellMark(5) == board.getCellMark(8)) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoe.IResultAnalyizer#isDiagonal()
	 */
	@Override
	public boolean isDiagonal() {
		if (Mark.EMPTY != board.getCellMark(0) && board.getCellMark(0) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(8)) {
			return true;
		}
		if (Mark.EMPTY != board.getCellMark(2) && board.getCellMark(2) == board.getCellMark(4)
				&& board.getCellMark(4) == board.getCellMark(6)) {
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoe.IResultAnalyizer#getResult()
	 */
	@Override
	public Result getResult() {
		return result;
	}

	/* (non-Javadoc)
	 * @see com.techlabs.tictactoe.IResultAnalyizer#getBoard()
	 */
	@Override
	public IBoard getBoard() {
		return board;
	}
}