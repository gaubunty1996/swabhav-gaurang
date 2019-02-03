package com.guiforbookmark;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class BookmarkGui extends JFrame {
	private Container container;
	private JButton addButton;
	private JButton viewButton;
	private JLabel domainNameLabel, urlLabel;
	private JTextField addDomian;
	private JTextField addurl;
	private JPanel viewBookmarksPanel;
	private JLabel emptyScreen = new JLabel("");
	ViewBookmark viewBookmark = new ViewBookmark();

	public BookmarkGui() throws HeadlessException {
		super();
		init();
	}

	public JLabel getEmptyScreen() {
		return emptyScreen;
	}

	public void setEmptyScreen(String emptyScreen) {
		this.emptyScreen.setText(emptyScreen);
	}

	public JPanel getViewBookmarksPanel() {
		return viewBookmarksPanel;
	}

	public void setViewBookmarksPanel(JPanel viewBookmarksPanel) {
		this.viewBookmarksPanel = viewBookmarksPanel;
	}

	public Container getContainer() {
		return container;
	}

	public void setContainer(Container container) {
		this.container = container;
	}

	public JButton getAddButton1() {
		return addButton;
	}

	public void setAddButton1(JButton addButton1) {
		this.addButton = addButton1;
	}

	public JButton getViewButton2() {
		return viewButton;
	}

	public void setViewButton2(JButton viewButton2) {
		this.viewButton = viewButton2;
	}

	public JLabel getDomainNameLabel() {
		return domainNameLabel;
	}

	public void setDomainNameLabel(JLabel domainNameLabel) {
		this.domainNameLabel = domainNameLabel;
	}

	public JLabel getUrlLabel() {
		return urlLabel;
	}

	public void setUrlLabel(JLabel urlLabel) {
		this.urlLabel = urlLabel;
	}

	public JTextField getAddDomian() {
		return addDomian;
	}

	public void setAddDomian(JTextField addDomian) {
		this.addDomian = addDomian;
	}

	public JTextField getAddurl() {
		return addurl;
	}

	public void setAddurl(JTextField addurl) {
		this.addurl = addurl;
	}

	public void init() {
		viewBookmarksPanel = new JPanel();
		
		container = getContentPane();
		container.setSize(1000, 1000);
		domainNameLabel = new JLabel("Enter Domain Name: ");
		urlLabel = new JLabel("Enter the url: ");

		domainNameLabel.setFont(new Font("Arial", Font.ITALIC, 25));
		urlLabel.setFont(new Font("Arial", Font.ITALIC, 25));

		addDomian = new JTextField();
		addurl = new JTextField();

		addButton = new JButton("Add bookmark");
		addButton.setBackground(Color.GRAY);
		viewButton = new JButton("View bookmarks");
		viewButton.setBackground(Color.GRAY);

		domainNameLabel.setBounds(80, 70, 250, 30);
		urlLabel.setBounds(80, 110, 200, 30);
		addDomian.setBounds(400, 70, 270, 30);
		addurl.setBounds(400, 110, 270, 30);
		addButton.setBounds(400, 160, 100, 30);
		viewButton.setBounds(520, 160, 150, 30);
		viewBookmarksPanel.setBounds(80, 200, 1600, 800);
		//emptyScreen.setBounds(80, 10, 1300,30);
		//viewBookmarksPanel.add(emptyScreen,0);
		
		viewBookmarksPanel.setOpaque(true);
		viewBookmarksPanel.setBackground(Color.WHITE);
		viewBookmarksPanel.setLayout(new GridLayout(viewBookmark.getListOfStrings().size(),1));
		container.add(domainNameLabel);
		container.add(addDomian);
		container.add(urlLabel);
		container.add(addurl);
		container.add(addButton);
		container.add(viewButton);
		container.add(viewBookmarksPanel);
		
		setSize(2000, 2000);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addButton.addActionListener(new AddBookmark(this));
		viewButton.addActionListener(new ViewBookmark(this));
		viewBookmarksPanel.validate();
		viewBookmarksPanel.repaint();
	}

}
