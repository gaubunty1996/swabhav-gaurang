package com.techlabs.TestCircle;

import com.techlab.circle.Circle;

public class TestCircle {

	public static void main(String[] args) {
		Circle smallCircle = new Circle();
		smallCircle.setRadius(1.5f);
		printDetails(smallCircle);

		Circle bigCircle = new Circle();
		bigCircle.setRadius(5.5f);
		printDetails(bigCircle);

		Circle temp = bigCircle;
		temp.setRadius(2.0f);
		//System.out.println(temp.getRadius());
		//System.out.println(bigCircle.getRadius());
		// temp = null;
		//System.out.println(bigCircle.getRadius());
		// System.out.println(temp.getRadius());

		Circle c1 = new Circle();
		c1.setRadius(2.2f);
		Circle c2 = new Circle();
		c2.setRadius(3.2f);
		Circle c3 = new Circle();
		c3.setRadius(4.2f);

		Circle[] circleArray = new Circle[3];
		circleArray[0] = c1;
		circleArray[1] = c2;
		circleArray[2] = c3;

		Circle bigObj = findBiggestCircle(circleArray);
		printDetails(bigObj);
		//contentsInArray(circleArray);
		printDetails(circleArray);

	}

	static private void printDetails(Circle circle) {
		//System.out.println(circle.hashCode());
		System.out.print(" value of pie is: " + circle.getValueOfPie() + " radius is: " + circle.getRadius());
		System.out.println("  Area of circle is: " + circle.calculateArea() + " and circumference is:"
				+ circle.calculateCircumference());
	}
	static private void printDetails(Circle[] circle) {
		//System.out.println(circle.hashCode());
		for (Circle circles:circle) {
			printDetails(circles);
		}
	}

	static private Circle findBiggestCircle(Circle[] circleArray) {

		// Circle objName= circleArray[0];
		int p = 1;
		// float biggest=0;
		for (int i = 1; i < circleArray.length; i++) {
			if (circleArray[p].getRadius() < circleArray[i].getRadius()) {
				p = i;
			}
		}
		return circleArray[p];
	}
	
	/*static private void contentsInArray(Circle[] circle) {
	//for(int i=0;i<circleArray.length;i++) {
		//System.out.println(circleArray[i]);
	//}
	for (Circle circles:circle) {
		System.out.print(" value of pie is: " + circles.getValueOfPie() + " radius is: " + circles.getRadius());
		System.out.println("  Area of circle is: " + circles.calculateArea() + " and circumference is:"
				+ circles.calculateCircumference());
	}
}*/
}
