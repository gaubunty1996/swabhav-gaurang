package com.techlab.tictactoe.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import com.techlabs.tictactoeunits.Player;;
public class StartPlaying implements ActionListener {
	TicTacToeUi ticTacToeUi;
	

	public StartPlaying(TicTacToeUi ticTacToeUi) {
		this.ticTacToeUi = ticTacToeUi;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String player1;
		String player2;
		player1 = ticTacToeUi.player1TextFeild.getText();
		player2 = ticTacToeUi.player2TextFeild.getText();
		Player newplayer1 = new Player(player1);
		Player newplayer2 = new Player(player2);
		PlayBoard board = new PlayBoard(newplayer1,newplayer2);
		board.setVisible(true);
	}

	

}
