package com.techlab.tictactoe.UI;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TicTacToeUi extends JFrame {
	Container container;
	JButton button1;
	public Container getContainer() {
		return container;
	}

	public void setContainer(Container container) {
		this.container = container;
	}

	public JButton getButton1() {
		return button1;
	}

	public void setButton1(JButton button1) {
		this.button1 = button1;
	}

	public JLabel getPlayer1() {
		return player1;
	}

	public void setPlayer1(JLabel player1) {
		this.player1 = player1;
	}

	public JLabel getPlayer2() {
		return player2;
	}

	public void setPlayer2(JLabel player2) {
		this.player2 = player2;
	}

	public JTextField getPlayer1TextFeild() {
		return player1TextFeild;
	}

	public void setPlayer1TextFeild(JTextField player1TextFeild) {
		this.player1TextFeild = player1TextFeild;
	}

	public JTextField getPlayer2TextFeild() {
		return player2TextFeild;
	}

	public void setPlayer2TextFeild(JTextField player2TextFeild) {
		this.player2TextFeild = player2TextFeild;
	}

	JLabel player1, player2;
	JTextField player1TextFeild, player2TextFeild;

	public TicTacToeUi() {
		//JFrame frame = new JFrame("TicTacToe");
		container=getContentPane();
		player1 = new JLabel("Player1");
		player2 = new JLabel("Player2");
		player1.setFont(new Font("Arial", Font.ITALIC, 25));
		player2.setFont(new Font("Arial", Font.ITALIC, 25));
		player1TextFeild = new JTextField();
		player2TextFeild = new JTextField();
		button1 = new JButton("Start Game");
		button1.setBackground(Color.GRAY);

		player1.setBounds(80, 70, 200, 30);
		player2.setBounds(80, 110, 200, 30);
		player1TextFeild.setBounds(300, 70, 200, 30);
		player2TextFeild.setBounds(300, 110, 200, 30);
		button1.setBounds(150, 160, 100, 30);
		
		container.add(player1);
		container.add(player1TextFeild);
		container.add(player2);
		container.add(player2TextFeild);
		container.add(button1);

		setSize(400,400);
		setLayout(null);
		setVisible(true);
		button1.addActionListener(new StartPlaying(this));
		

	}
}
