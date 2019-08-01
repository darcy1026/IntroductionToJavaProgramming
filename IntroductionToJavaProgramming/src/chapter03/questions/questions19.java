package chapter03.questions;

import java.util.Scanner;

public class questions19 {

	public static void main(String[] args) {
		/*
		 * (Compute the perimeter of a triangle) Write a program that reads three edges
		 * for a triangle and computes the perimeter if the input is valid. Otherwise,
		 * display that the input is invalid. The input is valid if the sum of every
		 * pair of two edges is greater than the remaining edge.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of each side of a triangle. I will calculate the perimeter.");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
			System.out.println("A side of the trinagle can not be greater than the sum of other two sides.");
		}else {
			System.out.println("The perimeter is " + (side1 + side2 + side3));
		}

	}

}
