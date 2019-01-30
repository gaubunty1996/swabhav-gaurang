package com.techlabs.commonlistners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrintText implements ActionListener {
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("Color Pressed " + e.getActionCommand());

	}

}
