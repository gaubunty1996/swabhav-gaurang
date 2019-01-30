package com.techlabs.commonlistners;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;


public class CommonListner  extends JFrame{
	private Container container;
	private JButton jbt;
	private JButton jbt2;

	public Container getContainer() {
		return container;
	}

	public JButton getJbt() {
		return jbt;
	}

	public JButton getJbt2() {
		return jbt2;
	}

	public CommonListner() {
		setTitle("CommonListenrs");
		setSize(500, 500);
		setLayout(new FlowLayout());
		setVisible(true);
		container = getContentPane();
		jbt = new JButton("Red");
		jbt.setBounds(100, 100, 100, 100);
		container.add(jbt);
		jbt2 = new JButton("Blue");
		jbt2.setBounds(200, 200, 100, 100);
		container.add(jbt2);
		jbt.addActionListener(new PrintText("Red"));
		jbt2.addActionListener(new PrintText("Blue"));
		jbt.addMouseListener(new ChangeColor(this));
		jbt2.addMouseListener(new ChangeColor(this));

	}
}
