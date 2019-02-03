package com.guiforbookmark;

import java.awt.Desktop;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.*;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenTheLinks implements MouseListener {
	ViewBookmark view = new ViewBookmark();

	public OpenTheLinks(ViewBookmark view) {
		super();
		this.view = view;
	}

	private static void open(URI uri) {
		if (Desktop.isDesktopSupported()) {
			try {
				Desktop.getDesktop().browse(uri);
			} catch (IOException e) {
				/* TODO: error handling */ }
		} else {
			/* TODO: error handling */ }
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		URI uri;

		for (int i = 0; i <= view.getListOfStrings().size(); i++) {
			if (e.getSource().toString().contains(view.getStringsOfJlabel().get(i))) {
				try {

					String[] urlName = view.getListOfStringsOfJlabel().get(i).getText().split(">");
					String name = view.getListOfStrings().get(i);
					String temp[] = name.split(">");
					System.out.println(Arrays.toString(temp) + " " + temp[0].substring(8));
					System.out.println("url of website: " + temp[0].substring(8));
					uri = new URI(temp[0].substring(8));
					open(uri);
					return;
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
