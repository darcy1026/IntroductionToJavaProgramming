package chapter02.questions;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		/*
		 * ( Geometry: distance of two points) Write a program that prompts the user to
		 * enter two points (x1, y1) and (x2, y2) and displays their distance between
		 * them. The formula for computing the distance is . Note that you can use
		 * Math.pow(a, 0.5) to compute .
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter two points for (x1, y1): ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.print("Please enter the two points for (x2, y2): ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		double distance = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));
		double finalDistance = Math.pow(distance, 0.5); // YAY! YENI OGRENDIM!!!!

		System.out.println("The distance between (x1, y1) and (x2, y2) is: " + finalDistance);

	}

}
