package com.testtic;

import com.tic.Board;
import com.tic.Game;
import com.tic.IBoard;
import com.tic.IResultAnalyizer;
import com.tic.Player;
import com.tic.ResultAnalyizer;

public class TicTacToeConsole {

	public static void main(String[] args) {
		Player player1 = new Player("Vinod");
		Player player2 = new Player("Prachit");
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		Game game = new Game(resultAnalyizer, board, player1, player2);
		game.play(0);
		game.play(1);
		game.play(4);
		game.play(2);
		game.play(8);
		System.out.println(resultAnalyizer.getResult());

	}

}

