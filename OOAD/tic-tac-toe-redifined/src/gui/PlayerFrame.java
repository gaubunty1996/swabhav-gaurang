package gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PlayerFrame extends JFrame {
	private JLabel label, label2;
	private JTextField text1;
	private JTextField text2;
	private Container container;
	private JButton button;

	public PlayerFrame() {
		container = getContentPane();
		label = new JLabel("Player 1");
		label2 = new JLabel("Player 2");
		text1 = new JTextField();
		text2 = new JTextField();
		button = new JButton("OK");

		label.setBounds(80, 70, 200, 30);
		text1.setBounds(300, 70, 200, 30);
		label2.setBounds(80, 110, 200, 30);
		text2.setBounds(300, 110, 200, 30);
		button.setBounds(150, 160, 100, 30);

		container.add(button);
		container.add(label);
		container.add(label2);
		container.add(text1);
		container.add(text2);

		button.addActionListener(new PlayerFrameAction(this));
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	public JLabel getLabel2() {
		return label2;
	}

	public void setLabel2(JLabel label2) {
		this.label2 = label2;
	}

	public JTextField getText1() {
		return text1;
	}

	public void setText1(JTextField text1) {
		this.text1 = text1;
	}

	public JTextField getText2() {
		return text2;
	}

	public void setText2(JTextField text2) {
		this.text2 = text2;
	}

	public Container getContainer() {
		return container;
	}

	public void setContainer(Container container) {
		this.container = container;
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}
}
