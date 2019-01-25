package lescowsolutions;

public class TestSolution {

	public static void main(String[] args) {
		
		widthShouldNotChangeWhenHeightIsChanged(new Rectangle(25, 25));
		
	}
	public static void widthShouldNotChangeWhenHeightIsChanged(Rectangle rectangle) {
		System.out.println("before changing height: "+rectangle.getWidth());
		rectangle.setHeight(100);
		System.out.println("before changing height: "+rectangle.getWidth());
	}

}
