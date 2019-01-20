package com.techlab.buissness.layer;

import com.techlab.service.layer.BookmarkServiceProvider;

public class Bookmark {
	private String nameOfWebsite;
	private String urlOfWebsite;

	public Bookmark() {
	}

	public String getNameOfWebsite() {
		return nameOfWebsite;
	}

	public String getUrlOfWebsite() {
		return urlOfWebsite;
	}

	public void callToAdd(String name, String url) {
		this.nameOfWebsite = name;
		this.urlOfWebsite = url;
	}

}
