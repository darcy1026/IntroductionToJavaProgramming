package chapter06.questions;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the three sides of trinagle: ");

		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();

		if (isValid(side1, side2, side3)) {
			System.out.printf("The area of the triangle is: %.3f", + area(side1, side2, side3));
			
		}else {
			System.out.println("input invalid");
		}
	}

	public static boolean isValid(double side1, double side2, double side3) {
		if ((side1 >= side2 + side3) || (side2 >= side1 + side3) || (side3 >= side1 + side2)) {
			return false;
		} else {
			return true;
		}
	}
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
}
