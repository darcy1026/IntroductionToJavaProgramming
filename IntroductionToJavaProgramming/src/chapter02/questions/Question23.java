package chapter02.questions;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		/*
		 * Cost of driving) Write a program that prompts the user to enter the distance
		 * to drive, the fuel efficiency of the car in miles per gallon, and the price
		 * per gallon, and displays the cost of the trip.
		 */
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();

		System.out.print("Enter miles per gallon: ");
		double perGallon = input.nextDouble();

		System.out.print("Enter price per gallon: ");
		double price = input.nextDouble();

		double cost = (distance / perGallon) * price;

		System.out.println("The cost of the driving is $" + cost);
	}

}
