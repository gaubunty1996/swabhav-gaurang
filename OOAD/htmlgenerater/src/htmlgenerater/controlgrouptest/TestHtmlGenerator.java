package htmlgenerater.controlgrouptest;

import htmlgenerater.controlgroup.Control;
import htmlgenerater.controlgroup.ControlGroup;

public class TestHtmlGenerator {
	public static StringBuffer compositeBuilder = new StringBuffer();

	public static void main(String[] args) {
		ControlGroup htmlRoot = new ControlGroup("html");
		ControlGroup body = new ControlGroup("body");
		ControlGroup div = new ControlGroup("div");

		Control paragraph = new Control("p", "Enter name");

		htmlRoot.addItem(body);
		body.addItem(div);
		div.addItem(paragraph);

		htmlRoot.displayDom();
	}

}
