package com.techlab.loginform;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CheckCredentials implements ActionListener {
	LoginForm loginForm;

	public CheckCredentials(LoginForm loginForm2) {
		this.loginForm = loginForm2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String userName = loginForm.getTextFeild().getText();
		char[] charPassword = loginForm.getPasswordFeild().getPassword();
		String password = "";
		for (int i = 0; i < charPassword.length; i++) {
			password = password + charPassword[i];
		}
		if (userName.equalsIgnoreCase("abc") && password.equals("abc@123")) {
			Welcome wel = new Welcome();
			wel.setVisible(true);
			JLabel label = new JLabel("Welcome:" + userName);
			wel.getContentPane().add(label);
		} else {
			JOptionPane.showMessageDialog(loginForm, "Wrong inputs");
		}
	}
}
