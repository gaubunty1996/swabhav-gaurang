package com.techlabs.tictactoeunits;

public class Cell {
	private Mark mark=Mark.EMPTY;

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark newmark) throws Exception {
		if (mark==Mark.EMPTY) {
			mark = newmark;
			return;
		}
		throw new Exception("Cell is not empty");
	}

}
