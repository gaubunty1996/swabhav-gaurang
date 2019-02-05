package com.guiforbookmark;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import com.techlab.service.layer.BookmarkManager;



public class AddBookmark implements ActionListener {
	private BookmarkGui addbookmarkgui;
	BookmarkManager bookmarkmanager = new BookmarkManager();
	
	public AddBookmark(BookmarkGui bookmarkgui) {
		super();
		this.addbookmarkgui = bookmarkgui;
	}
	

	public BookmarkGui getBookmarkgui() {
		return addbookmarkgui;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String domainName;
		String url;
		domainName = addbookmarkgui.getAddDomian().getText();
		url = addbookmarkgui.getAddurl().getText();
		try {
			bookmarkmanager.addBookmark(domainName, url);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		addbookmarkgui.validate();
		addbookmarkgui.repaint();
		
		
	}

}
