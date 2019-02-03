package com.techlab.service.layer;

import java.io.IOException;

public interface IBookmarkServiceProvider {

	void addBookmark(String name, String url) throws IOException;

	void displayBookmark() throws IOException;

	void exportBookmarks(String defaultDirectory, String customFileName) throws IOException;

}