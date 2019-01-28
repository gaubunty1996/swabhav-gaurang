package com.techlabs.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoeunits.Board;
import com.techlabs.tictactoeunits.CurrentGameState;
import com.techlabs.tictactoeunits.Game;
import com.techlabs.tictactoeunits.Mark;
import com.techlabs.tictactoeunits.Player;
import com.techlabs.tictactoeunits.ResultChecker;

class TestResultAnalyzer {

	@Test
	void testIfFirstRowIsSame() throws Exception {
		Board gameboard = new Board();
		ResultChecker resultchecker = new ResultChecker();
		Game.gameboard.setMarkatCustomLocation(0, Mark.CROSS);
		Game.gameboard.setMarkatCustomLocation(1, Mark.CROSS);
		Game.gameboard.setMarkatCustomLocation(2, Mark.CROSS);
		boolean check = resultchecker.checkIfFirstRowIsSame(gameboard);
		assertEquals(true, check);
	}
	@Test
	void testIfSecondRowIsSame() throws Exception {
		Board gameboard = new Board();
		ResultChecker resultchecker = new ResultChecker();
		Game.gameboard.setMarkatCustomLocation(3, Mark.CROSS);
		Game.gameboard.setMarkatCustomLocation(4, Mark.CROSS);
		Game.gameboard.setMarkatCustomLocation(5, Mark.CROSS);
		boolean check = resultchecker.checkIfSecondRowIsSame(gameboard);
		assertEquals(true, check);
	}
	@Test
	void testIfThirdRowIsSame() throws Exception {
		Board gameboard = new Board();
		ResultChecker resultchecker = new ResultChecker();
		Game.gameboard.setMarkatCustomLocation(6, Mark.CROSS);
		Game.gameboard.setMarkatCustomLocation(7, Mark.CROSS);
		Game.gameboard.setMarkatCustomLocation(8, Mark.CROSS);
		boolean check = resultchecker.checkIfThirdRowIsSame(gameboard);
		assertEquals(true, check);
	}
	@Test
	void testIfFirstColumnIsSame() throws Exception {
		Board gameboard = new Board();
		ResultChecker resultchecker = new ResultChecker();
		Game.gameboard.setMarkatCustomLocation(0, Mark.CROSS);
		Game.gameboard.setMarkatCustomLocation(3, Mark.CROSS);
		Game.gameboard.setMarkatCustomLocation(6, Mark.CROSS);
		boolean check = resultchecker.checkIfFirstColumnIsSame(gameboard);
		assertEquals(true, check);
	}
	@Test
	void testIfSecondColumnIsSame() throws Exception {
		Board gameboard = new Board();
		ResultChecker resultchecker = new ResultChecker();
		Game.gameboard.setMarkatCustomLocation(1, Mark.CROSS);
		Game.gameboard.setMarkatCustomLocation(4, Mark.CROSS);
		Game.gameboard.setMarkatCustomLocation(7, Mark.CROSS);
		boolean check = resultchecker.checkIfSecondColumnIsSame(gameboard);
		assertEquals(true, check);
	}
	@Test
	void testIfThirdColumnIsSame() throws Exception {
		Board gameboard = new Board();
		ResultChecker resultchecker = new ResultChecker();
		Game.gameboard.setMarkatCustomLocation(2, Mark.CROSS);
		Game.gameboard.setMarkatCustomLocation(5, Mark.CROSS);
		Game.gameboard.setMarkatCustomLocation(8, Mark.CROSS);
		boolean check = resultchecker.checkIfThirdColumnIsSame(gameboard);
		assertEquals(true, check);
	}
	@Test
	void testIfFirstDiagonalIsSame() throws Exception {
		Board gameboard = new Board();
		ResultChecker resultchecker = new ResultChecker();
		Game.gameboard.setMarkatCustomLocation(0, Mark.CROSS);
		Game.gameboard.setMarkatCustomLocation(4, Mark.CROSS);
		Game.gameboard.setMarkatCustomLocation(8, Mark.CROSS);
		boolean check = resultchecker.checkIfFirstDiagonalIsSame(gameboard);
		assertEquals(true, check);
	}
	@Test
	void testIfSecondDiagonalIsSame() throws Exception {
		Board gameboard = new Board();
		ResultChecker resultchecker = new ResultChecker();
		Game.gameboard.setMarkatCustomLocation(2, Mark.CROSS);
		Game.gameboard.setMarkatCustomLocation(4, Mark.CROSS);
		Game.gameboard.setMarkatCustomLocation(6, Mark.CROSS);
		boolean check = resultchecker.checkIfSecondDiagonalIsSame(gameboard);
		assertEquals(true, check);
	}
	@Test
	void testIfWon() throws Exception {
		Board board = new Board();
		ResultChecker resultchecker = new ResultChecker();
		Player p1 = new Player("a");
		Player p2 = new Player("b");
		Game game = new Game(p1, p2, resultchecker);
		game.gameboard.setMarkatCustomLocation(0, Mark.CROSS);
		game.gameboard.setMarkatCustomLocation(8, Mark.CROSS);
		game.gameboard.setMarkatCustomLocation(1, Mark.CROSS);
		game.gameboard.setMarkatCustomLocation(7, Mark.CROSS);
		game.gameboard.setMarkatCustomLocation(2, Mark.CROSS);
		CurrentGameState state = resultchecker.checkIfWon(game);
		boolean check = resultchecker.checkIfFirstRowIsSame(game.gameboard);
		assertEquals(true, check);
	}

}
