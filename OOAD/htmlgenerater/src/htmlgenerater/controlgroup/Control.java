package htmlgenerater.controlgroup;

public class Control implements IControl {

	private String tagName;

	public Control(String tagName) {
		super();
		this.tagName = tagName;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
}

	@Override
	public void displayDom() {
		System.out.println("<" + tagName + ">");
		System.out.println("</" + tagName + ">");
	}
	}