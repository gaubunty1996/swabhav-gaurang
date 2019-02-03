package htmlgenerater.controlgroup;

import java.util.ArrayList;
import java.util.List;

import htmlgenerater.controlgrouptest.TestHtmlGenerator;

public class ControlGroup implements IControl {
	private String name;

	private List<IControl> nameList = new ArrayList<IControl>();

	public ControlGroup(String name) {
		this.name = name;
	}

	public String getTagName() {
		return name;
	}

	public List<IControl> getListOfTags() {
		return nameList;
	}

	public void addItem(IControl icontrol) {
		nameList.add(icontrol);
	}

	@Override
	public void displayDom() {
		System.out.println(TestHtmlGenerator.compositeBuilder + "   <" + name + ">");
		TestHtmlGenerator.compositeBuilder.append("   ");
		for (IControl element : nameList) {
			element.displayDom();
		}
		System.out.println(TestHtmlGenerator.compositeBuilder + "</" + name + ">");
		TestHtmlGenerator.compositeBuilder.setLength(TestHtmlGenerator.compositeBuilder.length() - 3);
	}
}