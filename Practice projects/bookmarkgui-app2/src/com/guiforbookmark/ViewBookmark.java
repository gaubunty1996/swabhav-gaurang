package com.guiforbookmark;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;

public class ViewBookmark implements ActionListener {
	private BookmarkGui viewbookmarkgui;
	private String fileName = "data\\newbookmark.txt";
	private ArrayList<String> listOfStrings = new ArrayList<>();
	private ArrayList<JLabel> listOfStringsOfJlabel = new ArrayList<JLabel>();
	private ArrayList<String> StringsOfJlabel = new ArrayList<String>();

	public ArrayList<String> getStringsOfJlabel() {
		return StringsOfJlabel;
	}

	public ArrayList<JLabel> getListOfStringsOfJlabel() {
		return listOfStringsOfJlabel;
	}

	public ArrayList<String> getListOfStrings() {
		return listOfStrings;
	}

	public ViewBookmark(BookmarkGui bookmarkgui) {
		super();
		this.viewbookmarkgui = bookmarkgui;
	}

	public BookmarkGui getBookmarkgui() {
		return viewbookmarkgui;
	}

	public ViewBookmark() {
		super();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JLabel newLabel = viewbookmarkgui.getEmptyScreen();

		File file = new File(fileName);
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = "";

			listOfStrings.add(line);
			while ((line = br.readLine()) != null) {
				listOfStrings.add(line);
			}
			br.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		listOfStrings.remove(0);
		System.out.println(listOfStrings);

		for (int i = 0; i < listOfStrings.size(); i++) {
			JLabel extraLabel = new JLabel();
			extraLabel.setBackground(Color.WHITE);
			extraLabel.setText("<HTML>" + listOfStrings.get(i) + "<HTML>");
			// extraLabel.addMouseListener(new OpenTheLinks(this));
			listOfStringsOfJlabel.add(extraLabel);
			StringsOfJlabel.add(extraLabel.getText());
			viewbookmarkgui.getViewBookmarksPanel().add(extraLabel);
			viewbookmarkgui.getViewBookmarksPanel().validate();
			viewbookmarkgui.getViewBookmarksPanel().repaint();
			// System.out.println("Added: ");
		}
		viewbookmarkgui.getViewBookmarksPanel().revalidate();
		viewbookmarkgui.getViewBookmarksPanel().repaint();
		for (int i = 0; i < listOfStringsOfJlabel.size(); i++) {
			listOfStringsOfJlabel.get(i).addMouseListener(new OpenTheLinks(this));
		}

	}
}
