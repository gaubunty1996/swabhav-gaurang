package com.techlab.loginform;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame {
	JLabel labelLoginForm, labelUserName, labelPassword;
	JTextField textFeild;
	JButton button1;
	public JLabel getLabelLoginForm() {
		return labelLoginForm;
	}

	public JLabel getLabelUserName() {
		return labelUserName;
	}

	public JLabel getLabelPassword() {
		return labelPassword;
	}

	public JTextField getTextFeild() {
		return textFeild;
	}

	public JButton getButton1() {
		return button1;
	}

	public JPasswordField getPasswordFeild() {
		return passwordFeild;
	}

	JPasswordField passwordFeild;

	public LoginForm() {
		JFrame frame = new JFrame("Login Form");
		labelLoginForm = new JLabel("Login Form");
		labelLoginForm.setForeground(Color.blue);
		labelLoginForm.setFont(new Font("Serif", Font.BOLD, 20));

		labelUserName = new JLabel("Username");
		labelPassword = new JLabel("Password");
		textFeild = new JTextField();
		passwordFeild = new JPasswordField();
		button1 = new JButton("Login");

		labelLoginForm.setBounds(100, 30, 400, 30);
		labelUserName.setBounds(80, 70, 200, 30);
		labelPassword.setBounds(80, 110, 200, 30);
		textFeild.setBounds(300, 70, 200, 30);
		passwordFeild.setBounds(300, 110, 200, 30);
		button1.setBounds(150, 160, 100, 30);

		frame.add(labelLoginForm);
		frame.add(labelUserName);
		frame.add(textFeild);
		frame.add(labelPassword);
		frame.add(passwordFeild);
		frame.add(button1);

		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
