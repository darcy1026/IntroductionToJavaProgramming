package chapter02.questions;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		/*
		 * ( Physics: finding run way length) Given an airplane’s acceleration a and
		 * take off speed v, you can compute the minimum run way length needed for an
		 * airplane to take off using the following formula: Write a program that
		 * prompts the user to enter v in meters/second (m/s) and the acceleration a in
		 * meters/second squared (m/s2), and displays the minimum run way length.
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the airplane'e take off speed: ");
		double speed = input.nextInt();
		
		System.out.print("Enter the airplane's acceleration: ");
		double acceleration = input.nextDouble();
		
		System.out.println("You have entered " + speed + " for speed and also entered " + acceleration + " for acceeration.");
		
		double length = (speed * speed) / (2 * acceleration);
		
		System.out.println("Your minimum distance for your run way is " + length + ".");
		

	}

}
