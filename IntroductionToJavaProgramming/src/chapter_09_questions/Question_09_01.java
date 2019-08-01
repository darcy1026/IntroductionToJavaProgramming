package chapter_09_questions;

public class Question_09_01 {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(4, 40);

		Rectangle rect2 = new Rectangle(3.5, 35.9);
		
		System.out.println("The width of 1st rect: " + rect1.width);
		System.out.println("The height of 1st rect: " + rect1.height);
		System.out.println("The area of 1st rect: " + rect1.getArea());
		System.out.println("The perimeter of 1st rect: " + rect1.getPerimeter());
		System.out.println("=================");
		System.out.println("The width of 2nd rect: " + rect2.width);
		System.out.println("The height of 2nd rect: " + rect2.height);
		System.out.println("The area of 2nd rect: " + rect2.getArea());
		System.out.println("The perimeter of 2nd rect: " + rect2.getPerimeter());
		
	}

}
