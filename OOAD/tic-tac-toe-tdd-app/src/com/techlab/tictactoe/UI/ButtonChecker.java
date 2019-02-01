package com.techlab.tictactoe.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.techlabs.tictactoeunits.Game;

public class ButtonChecker implements ActionListener {
	private PlayBoard board;
	private Game game;

	public ButtonChecker(PlayBoard board) {
		this.board = board;
		this.game = game;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {

			if (e.getActionCommand().equals("0")) {
				game.play(0);
				

			} else if (e.getActionCommand().equals("1")) {
				game.play(1);

			} else if (e.getActionCommand().equals("2")) {
				int index = Integer.parseInt(e.getActionCommand());
				game.play(index);

			} else if (e.getActionCommand().equals("3")) {
				game.play(3);

			} else if (e.getActionCommand().equals("4")) {
				game.play(4);

			} else if (e.getActionCommand().equals("5")) {
				game.play(5);

			} else if (e.getActionCommand().equals("6")) {
				game.play(6);

			} else if (e.getActionCommand().equals("7")) {
				game.play(7);

			} else if (e.getActionCommand().equals("8")) {
				game.play(8);

			}
		} catch (Exception exp) {
			System.out.println(exp.getMessage());
		}
	}
}
