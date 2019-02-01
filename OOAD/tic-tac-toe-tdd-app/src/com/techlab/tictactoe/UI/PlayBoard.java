package com.techlab.tictactoe.UI;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.techlabs.tictactoeunits.Board;
import com.techlabs.tictactoeunits.CurrentGameState;
import com.techlabs.tictactoeunits.Game;
import com.techlabs.tictactoeunits.IBoard;
import com.techlabs.tictactoeunits.IResultAnalyzer;
import com.techlabs.tictactoeunits.Mark;
import com.techlabs.tictactoeunits.Player;
import com.techlabs.tictactoeunits.ResultChecker;

public class PlayBoard extends JFrame {
	JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
	Container container1;
	JLabel label1;
	private JTextField textField;
	private JTextField textFeildForMarker;
	Player player, player2;

	public PlayBoard(Player player, Player player2) {
		this.player = player;
		this.player2 = player2;
		initial();
	}

	public JButton getButton1() {
		return button1;
	}

	public JButton getButton2() {
		return button2;
	}

	public JButton getButton3() {
		return button3;
	}

	public JButton getButton4() {
		return button4;
	}

	public JButton getButton5() {
		return button5;
	}

	public JButton getButton6() {
		return button6;
	}

	public JButton getButton7() {
		return button7;
	}

	public JButton getButton8() {
		return button8;
	}

	public JButton getButton9() {
		return button9;
	}

	public Container getContainer1() {
		return container1;
	}

	public JLabel getLabel1() {
		return label1;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextFeildForMarker() {
		return textFeildForMarker;
	}

	public void setButton1(JButton button1) {
		this.button1 = button1;
	}

	public void setButton2(JButton button2) {
		this.button2 = button2;
	}

	public void setButton3(JButton button3) {
		this.button3 = button3;
	}

	public void setButton4(JButton button4) {
		this.button4 = button4;
	}

	public void setButton5(JButton button5) {
		this.button5 = button5;
	}

	public void setButton6(JButton button6) {
		this.button6 = button6;
	}

	public void setButton7(JButton button7) {
		this.button7 = button7;
	}

	public void setButton8(JButton button8) {
		this.button8 = button8;
	}

	public void setButton9(JButton button9) {
		this.button9 = button9;
	}

	public void setContainer1(Container container1) {
		this.container1 = container1;
	}

	public void setLabel1(JLabel label1) {
		this.label1 = label1;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public void setTextFeildForMarker(JTextField textFeildForMarker) {
		this.textFeildForMarker = textFeildForMarker;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public Player getPlayer() {
		return player;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void initial() {
		IBoard board = new Board();
		IResultAnalyzer resultAnalyzer = new ResultChecker();
		Game game = new Game(player, player2, resultAnalyzer);
		container1 = getContentPane();
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");

		textField = new JTextField(player.getName());
		textFeildForMarker = new JTextField(game.getMark().toString());

		setLayout(new GridLayout(4, 4));

		container1.add(button1, 0);
		container1.add(button2, 1);
		container1.add(button3, 2);
		container1.add(button4, 3);
		container1.add(button5, 4);
		container1.add(button6, 5);
		container1.add(button7, 6);
		container1.add(button8, 7);
		container1.add(button9, 8);
		container1.add(textField, 9);
		container1.add(textFeildForMarker, 10);

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton customButton;

				int index = Integer.parseInt(e.getActionCommand());
				String playerName = player.getName();
				int position = index - 1;
				CurrentGameState state;
				String crossimg="C:\\Users\\gaurang\\Desktop\\cross&nought\\cross.png";
				String noughtimg="C:\\Users\\gaurang\\Desktop\\cross&nought\\nought.png";
				try {
					ImageIcon crossicon = new ImageIcon(crossimg);
					ImageIcon noughticon = new ImageIcon(noughtimg);
					//Image crossimage = ImageIO
							//.read(getClass().getResource("C:\\Users\\gaurang\\Desktop\\cross&nought\\cross.png"));
					state = game.play(position);
					textField.setText(game.getCurrentPlayer().getName());
					textFeildForMarker.setText(game.getMark().toString());
					Mark mark = game.getGameboard().getMarkfromLocation(position);
					customButton = (JButton) e.getSource();
					
					if (mark == Mark.CROSS) {
						//customButton.setText("X");
						customButton.setIcon(crossicon);
					} else {
						//customButton.setText("O");
						customButton.setIcon(noughticon);
					}
					if (state == CurrentGameState.WIN || state == CurrentGameState.DRAW) {
						if (state == CurrentGameState.DRAW) {
							playerName = "Nobody wins so draw";
						}
						JFrame f = new JFrame();
						JOptionPane.showMessageDialog(f, playerName + " " + state);

					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		};

		button1.addActionListener(actionListener);
		button2.addActionListener(actionListener);
		button3.addActionListener(actionListener);
		button4.addActionListener(actionListener);
		button5.addActionListener(actionListener);
		button6.addActionListener(actionListener);
		button7.addActionListener(actionListener);
		button8.addActionListener(actionListener);
		button9.addActionListener(actionListener);

		setVisible(true);

	}

}
