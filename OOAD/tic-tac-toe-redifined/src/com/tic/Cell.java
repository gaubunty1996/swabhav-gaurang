package com.tic;

public class Cell {
	private Mark mark;

	public Cell() {
		this.mark = Mark.EMPTY;
	}

	public Mark getMark() {
		return mark;
	}

	public void setMark(Mark mark) {
		if (this.mark == Mark.EMPTY) {
			this.mark = mark;
		} else {
			throw new RuntimeException("Cell Already Marks");
		}
	}

}