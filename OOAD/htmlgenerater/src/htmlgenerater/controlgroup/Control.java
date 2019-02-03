package htmlgenerater.controlgroup;

import htmlgenerater.controlgrouptest.TestHtmlGenerator;

public class Control implements IControl {

	private String name;
	private String name1;

	public Control(String name, String name1) {
		super();
		this.name = name;
		this.name1 = name1;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void displayDom() {
		System.out.println(TestHtmlGenerator.compositeBuilder + "<" + name + ">" + name1);
		System.out.println(TestHtmlGenerator.compositeBuilder + "</" + name + ">");
	}
}