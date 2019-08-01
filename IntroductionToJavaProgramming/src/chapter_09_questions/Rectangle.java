package chapter_09_questions;

public class Rectangle {

	double height = 1;

	double width = 1;

	Rectangle() {
 
	}

	Rectangle(double specifiedWidth, double specifiedHeight) {

		width = specifiedWidth;
		height = specifiedHeight;

	}
	
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return 2 * (width + height);
	}
}
