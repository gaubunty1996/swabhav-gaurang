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
		this.setTitle("CommonListenrs");
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		container = getContentPane();
		this.jbt = new JButton("Red");
		jbt.setBounds(100, 100, 100, 100);
		container.add(jbt);
		this.jbt2 = new JButton("Blue");
		jbt2.setBounds(200, 100, 100, 100);
		container.add(jbt2);
		jbt.addActionListener(new PrintText());
		jbt2.addActionListener(new PrintText());
		jbt.addMouseListener(new ChangeColor(this));
		jbt2.addMouseListener(new ChangeColor(this));

	}
}
