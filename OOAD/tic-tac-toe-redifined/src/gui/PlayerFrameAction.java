package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.tic.Player;

public class PlayerFrameAction implements ActionListener {
	private PlayerFrame playerFrame;

	public PlayerFrameAction(PlayerFrame playerFrame) {
		this.playerFrame = playerFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String player1 = playerFrame.getText1().getText();
		String player2 = playerFrame.getText2().getText();
		Player player3 = new Player(player1);
		Player player4 = new Player(player2);
		GameConsoleFrame consoleFrame = new GameConsoleFrame(player3, player4);
	}

	
}