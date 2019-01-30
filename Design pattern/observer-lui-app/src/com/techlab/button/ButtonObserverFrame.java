package com.techlab.button;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonObserverFrame extends JFrame {
	Container container;
	JButton jbt;

	public ButtonObserverFrame() {
		setTitle("ButtonObserverFrame");
		setSize(500, 500);
		setLayout(null);
		setVisible(true);
		container = getContentPane();
		jbt = new JButton("Ok");
		jbt.setBounds(170, 170, 50, 50);
		container.add(jbt);
		jbt.addActionListener(new OkListners());
		jbt.addActionListener(new GoodByeListners());

	}
}
