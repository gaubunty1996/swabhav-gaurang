package com.techlabs.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlabs.tictactoeunits.Board;
import com.techlabs.tictactoeunits.CurrentGameState;
import com.techlabs.tictactoeunits.Game;
import com.techlabs.tictactoeunits.Mark;
import com.techlabs.tictactoeunits.Player;
import com.techlabs.tictactoeunits.ResultChecker;

class TestGame {

	@Test
	void testCurrentPlayer() {
	Player p1 = new Player("Gaurang");
	Player p2 = new Player("jaaie");
	ResultChecker resultChecker = new ResultChecker();
	Board gameboard = new Board();
	Game game = new Game(p1,p2,resultChecker);
	Player currentPlayer = game.getCurrentPlayer();
	assertEquals(p1, currentPlayer);
	}
	@Test
	void testOtherPlayer() {
	Player p1 = new Player("Gaurang");
	Player p2 = new Player("jaaie");
	ResultChecker resultChecker = new ResultChecker();
	Board gameboard = new Board();
	Game game = new Game(p1,p2,resultChecker);
	Player currentPlayer = game.getOtherPlayer();
	assertEquals(p2, currentPlayer);
	}
	@Test
	void testCurrentPlayerMark() {
	Player p1 = new Player("Gaurang");
	Player p2 = new Player("jaaie");
	ResultChecker resultChecker = new ResultChecker();
	Board gameboard = new Board();
	Game game = new Game(p1,p2,resultChecker);
	Mark currentPlayerMark = game.getMark();
	assertEquals(Mark.CROSS, currentPlayerMark);
	}
	@Test
	void testSwitchingOfPlayers() throws Exception {
		Player p1 = new Player("Gaurang");
		Player p2 = new Player("jaaie");
		ResultChecker resultChecker = new ResultChecker();
		Board gameboard = new Board();
		Game game = new Game(p1,p2,resultChecker);
		game.play(0);
		Player currentPlayer = game.getCurrentPlayer();
		assertEquals(p2, currentPlayer);
	}
	@Test
	void testIfCurrentStateIsInprogress() throws Exception {
		Player p1 = new Player("Gaurang");
		Player p2 = new Player("jaaie");
		ResultChecker resultChecker = new ResultChecker();
		Board gameboard = new Board();
		Game game = new Game(p1,p2,resultChecker);
		game.play(0);
		CurrentGameState currentGameState = game.getCurrentstate();
		assertEquals(CurrentGameState.INPROGRESS, currentGameState);
	}
	@Test
	void testIfCurrentStateIsWin() throws Exception {
		Player p1 = new Player("Gaurang");
		Player p2 = new Player("jaaie");
		ResultChecker resultChecker = new ResultChecker();
		Board gameboard = new Board();
		Game game = new Game(p1,p2,resultChecker);
		game.play(0);
		game.play(8);
		game.play(1);
		game.play(7);
		game.play(2);
		CurrentGameState currentGameState = game.getCurrentstate();
		assertEquals(CurrentGameState.WIN, currentGameState);
	}
	@Test
	void testIfCurrentStateIsDraw() throws Exception {
		Player p1 = new Player("Gaurang");
		Player p2 = new Player("jaaie");
		ResultChecker resultChecker = new ResultChecker();
		Board gameboard = new Board();
		Game game = new Game(p1,p2,resultChecker);
		game.play(0);
		game.play(8);
		game.play(2);
		game.play(1);
		game.play(3);
		game.play(6);
		game.play(7);
		game.play(4);
		game.play(5);
		CurrentGameState currentGameState = game.getCurrentstate();
		assertEquals(CurrentGameState.DRAW, currentGameState);
	}
	@Test
	void testIfCurrentStateIsDuplicateFound() throws Exception{
		Player p1 = new Player("Gaurang");
		Player p2 = new Player("jaaie");
		ResultChecker resultChecker = new ResultChecker();
		Board gameboard = new Board();
		Game game = new Game(p1,p2,resultChecker);
		game.play(0);
		game.play(0);
		CurrentGameState currentGameState = game.getCurrentstate();
		assertEquals(CurrentGameState.DUPLICATE_NUMBER, currentGameState);
	}
	

}
