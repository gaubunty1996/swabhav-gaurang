package com.techlab.button;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GoodByeListners implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("goodbye listner called");
	}

}
