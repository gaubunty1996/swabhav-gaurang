package com.techlabs.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoeunits.Board;

class TestBoard {

	@Test
	void checkIfBoardEmpty() throws Exception {
		Board board = new Board();
		boolean b=board.checkIfEmpty();
		assertEquals(true, b);
	}
	void checkiffull() throws Exception {
		Board board = new Board();
		boolean b=board.checkIfFull();
		assertEquals(true, b);
	}

}
