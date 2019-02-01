package htmlgenerater.controlgrouptest;

import htmlgenerater.controlgroup.Control;
import htmlgenerater.controlgroup.ControlGroup;

public class TestHtmlGenerator {
	public static void main(String[] args) {
		ControlGroup html = new ControlGroup("html");
		ControlGroup body = new ControlGroup("body");
		ControlGroup div = new ControlGroup("div");

		Control p = new Control("p");
		Control TextBox = new Control("textBox");

		html.addItem(body);
		body.addItem(div);
		div.addItem(p);
		div.addItem(TextBox);

		html.displayDom();
	}

}
