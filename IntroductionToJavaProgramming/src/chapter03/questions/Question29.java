package chapter03.questions;

import java.util.Scanner;

public class Question29 {

	public static void main(String[] args) {
		/*
		 * (Geometry: two circles) Write a program that prompts the user to enter the
		 * center coordinates and radii of two circles and determines whether the second
		 * circle is inside the first or overlaps with the first, as shown in Figure
		 * 3.10. (Hint: circle2 is inside circle1 if the distance between the two
		 * centers 6 = |r1 - r2| and circle2 overlaps circle1 if the distance between
		 * the two centers <= r1 + r2. Test your program to cover all cases.) Here are
		 * the sample runs:
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter circle's center x-, y- coordinates, and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double radius1 = input.nextDouble();
	
		System.out.println("Enter circle1's center x-, y- coordinates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double radius2 = input.nextDouble();
		
		double distance = Math.pow((Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)), 0.5);
		
		if (distance <= Math.abs(radius1 - radius2)) {
			System.out.println("Circle2 is inside circle1.");
		}else if (distance <= radius1 + radius2) {
			System.out.println("Circle 2 is overlaps circle1.");
		}else {
			System.out.println("Circle2 does not overlap circle1.");
		}
	}
}
