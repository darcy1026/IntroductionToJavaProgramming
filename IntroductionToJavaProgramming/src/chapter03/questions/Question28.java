package chapter03.questions;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		/*
		 * (Geometry: two rectangles) Write a program that prompts the user to enter the
		 * center x-, y-coordinates, width, and height of two rectangles and determines
		 * whether the second rectangle is inside the first or overlaps with the first,
		 * as shown in Figure 3.9. Test your program to cover all cases.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter r1's center x-, y- coordinates, width and height: ");
		double r1x = input.nextDouble();
		double r1y = input.nextDouble();
		double r1Width = input.nextDouble();
		double r1Height = input.nextDouble();

		
		System.out.println("Enter r2's center x-, y- coordinates, width and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2Width = input.nextDouble();
		double r2Height = input.nextDouble();

		
		 

	}

}
