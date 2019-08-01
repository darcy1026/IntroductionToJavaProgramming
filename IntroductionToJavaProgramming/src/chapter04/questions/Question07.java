package chapter04.questions;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		/*
		 * (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one
		 * point at the 0 o’clock position, as shown in Figure 4.7c. Write a program
		 * that prompts the user to enter the radius of the bounding circle of a
		 * pentagon and displays the coordinates of the five corner points on the
		 * pentagon. Here is a sample run:
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius of the bounding circle: ");
		
		double radius = input.nextDouble();
		
		double x0 = Math.sin(Math.toRadians(0));
		double y0 = radius;
		double x1 = -1 * radius * Math.sin(Math.toRadians(72));
		double y1 = radius * Math.cos(Math.toRadians(72));
		double x2 = radius * Math.sin(Math.toRadians(72));
		double y2 = radius * Math.cos(Math.toRadians(72));
		double x3 = -1 * radius * Math.sin(Math.toRadians(36));
		double y3 = -1 * radius * Math.cos(Math.toRadians(36));
		double x4 =  radius * Math.sin(Math.toRadians(36));
		double y4 = -1 * radius * Math.cos(Math.toRadians(36));
		
		System.out.println("The coordinates of five points on the pentagon are: \n"
				+ "(" + x0 + ", " + y0 + ")" + "\n(" + x1 + ", " + y1 + ")" + "\n(" + x2 + ", " + y2 + ")"
				+ "\n(" + x3 + ", " + y3 + ")" + "\n(" + x4 + ", " + y4 + ")");
	}

}
