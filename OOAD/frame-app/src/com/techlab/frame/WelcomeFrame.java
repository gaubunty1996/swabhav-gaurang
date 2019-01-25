package com.techlab.frame;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class WelcomeFrame extends JFrame {
	public WelcomeFrame() {
		this.setLayout(new FlowLayout());
		
		this.setTitle("Welcome");
		this.setSize(500, 500);
		this.setVisible(true);
		
	}

}
