package gui;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.tic.Board;
import com.tic.Game;
import com.tic.IBoard;
import com.tic.IResultAnalyizer;
import com.tic.Mark;
import com.tic.Player;
import com.tic.Result;
import com.tic.ResultAnalyizer;

public class GameConsoleFrame extends JFrame {
	private Container container;
	private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9;
	private JTextField textField;
	Player player, player2;

	public GameConsoleFrame(Player player, Player player2) {
		this.player = player;
		this.player2 = player2;
		initial();
	}

	public void initial() {
		IBoard board = new Board();
		IResultAnalyizer resultAnalyizer = new ResultAnalyizer(board);
		Game game = new Game(resultAnalyizer, board, player, player2);

		container = getContentPane();
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		textField = new JTextField(player.getPlayerName());

		button1.setBounds(50, 50, 50, 30);
		button2.setBounds(120, 50, 50, 30);
		button3.setBounds(190, 50, 50, 30);

		button4.setBounds(50, 100, 50, 30);
		button5.setBounds(120, 100, 50, 30);
		button6.setBounds(190, 100, 50, 30);

		button7.setBounds(50, 150, 50, 30);
		button8.setBounds(120, 150, 50, 30);
		button9.setBounds(190, 150, 50, 30);

		textField.setBounds(300, 150, 50, 30);

		container.add(button1);
		container.add(button2);
		container.add(button3);

		container.add(button4);
		container.add(button5);
		container.add(button6);

		container.add(button7);
		container.add(button8);
		container.add(button9);

		container.add(textField);

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int index = Integer.parseInt(e.getActionCommand());
				String playerName = player.getPlayerName();
				int position = index - 1;
				Result state = game.play(position);
				textField.setText(game.getCurrentPlayer().getPlayerName());
				Mark mark = game.getBoard().getCellMark(position);

				if (state == Result.WIN || state == Result.DRAW) {
					if (state == Result.DRAW) {
						playerName = "";
					}
					JFrame f = new JFrame();
					JOptionPane.showMessageDialog(f, playerName + " " + state);

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

		setLayout(null);
		setSize(500, 500);
		setVisible(true);

	}

}