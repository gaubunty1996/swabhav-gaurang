package com.techlabs.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoeunits.Board;
import com.techlabs.tictactoeunits.Console;
import com.techlabs.tictactoeunits.IBoard;
import com.techlabs.tictactoeunits.Mark;

class TestBoard {

	@Test
	void checkIfBoardEmpty() throws Exception {
		IBoard board = new Board();
		boolean b=board.checkIfEmpty();
		assertEquals(true, b);
	}
	@Test
	void checkiffull() throws Exception {
		IBoard board = new Board();
		boolean b=board.checkIfFull();
		assertEquals(false, b);
	}
	@Test
	void setMark() throws Exception{
		IBoard board = new Board();
		Console console = new Console();
		board.setMarkatCustomLocation(0, Mark.CROSS);
		Mark setMark = board.getMarkfromLocation(0);
		assertEquals(Mark.CROSS, setMark);
	}
	
	

}
