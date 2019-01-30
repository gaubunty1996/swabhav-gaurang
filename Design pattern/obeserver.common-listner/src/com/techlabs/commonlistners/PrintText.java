package com.techlabs.commonlistners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrintText implements ActionListener {
	private String color;

	public PrintText(String color) {
		this.color = color;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("Color Pressed " + e.getActionCommand());

	}

}
