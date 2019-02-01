package htmlgenerater.controlgroup;

import java.util.ArrayList;
import java.util.List;

public class ControlGroup implements IControl {
	private String tagName;

	private List<IControl> listOfTags = new ArrayList<IControl>();
	public ControlGroup(String tagName) {
		this.tagName=tagName;
	}

	public String getTagName() {
		return tagName;
	}

	public List<IControl> getListOfTags() {
		return listOfTags;
	}
	public void addItem(IControl icontrol) {
		listOfTags.add(icontrol);
	}


	@Override
	public void displayDom() {
		System.out.println("<"+tagName+">");
		for (IControl element:listOfTags) {
			element.displayDom();
		}
		System.out.println("</"+tagName+">");
	}
}
