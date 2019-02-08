package com.techlab.async;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Asynchronous extends JFrame {
	private Container container;
	private JButton button1, button2;

	public Asynchronous() {
		init();
	}

	public void init() {
		container = getContentPane();
		button1 = new JButton("Hello");
		button2 = new JButton("Display");

		button1.setBounds(50, 100, 100, 30);
		button2.setBounds(200, 100, 100, 30);

		container.add(button1);
		container.add(button2);

		ActionListener actionListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame, "Hello Click");
			}
		};

		ActionListener actionListener2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Thread t1=new Thread(new Display());
				t1.start();
			}
		};

		button1.addActionListener(actionListener);
		button2.addActionListener(actionListener2);

		setLayout(null);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] agrs) {
		Asynchronous synchronous = new Asynchronous();
	}
}