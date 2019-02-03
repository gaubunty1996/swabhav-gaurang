package com.guiforbookmark;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JLabel;

public class ViewBookmark implements ActionListener {
	private BookmarkGui viewbookmarkgui;
	private String fileName = "data\\newbookmark.txt";

	public ViewBookmark(BookmarkGui bookmarkgui) {
		super();
		this.viewbookmarkgui = bookmarkgui;
	}

	public BookmarkGui getBookmarkgui() {
		return viewbookmarkgui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JLabel newLabel = viewbookmarkgui.getEmptyScreen();
		
		File file = new File(fileName);
		BufferedReader br;
		ArrayList<String> listOfStrings = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(file));
			String line = " ";

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

		for (int i = 0; i < listOfStrings.size(); i++) {
			viewbookmarkgui.setEmptyScreen(viewbookmarkgui.getEmptyScreen().getText() +"\n<HTML>"+ listOfStrings.get(i)+"</HTML>");
			
		}
		System.out.println(listOfStrings);
		/*String name = "gaurang";
		String urlName = "www.gaurang.com";
		String tempHolder = "\nDomain Name" + name + "\nUrl:" + urlName;
		viewbookmarkgui.setEmptyScreen(viewbookmarkgui.getEmptyScreen().getText() + tempHolder);*/
		// viewbookmarkgui.setEmptyScreen(newLabel.setText(text););
		// viewbookmarkgui.setEmptyScreen(viewbookmarkgui.getEmptyScreen().getText()+"<a
		// href"+"\""+urlName+" \""+">"+name+"</a></html>");

	}
}
