package chapter03.questions;

import java.util.Scanner;

public class question18 {

	public static void main(String[] args) {
		/*
		 * (Cost of shipping) A shipping company uses the following function to
		 * calculate the cost (in dollars) of shipping based on the weight of the
		 * package (in pounds). c(w) = d 3.5, if 0 6 w 6 = 1 5.5, if 1 6 w 6 = 3 8.5, if
		 * 3 6 w 6 = 10 10.5, if 10 6 w 6 = 20 Write a program that prompts the user to
		 * enter the weight of the package and display the shipping cost. If the weight
		 * is greater than 50, display a message “the package cannot be shipped.”
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the weight of the package in pounds.");
		double weight = input.nextDouble();

		if (0 < weight && weight <= 1) {
			System.out.println("The price is 3.5");
		} else if (1 < weight && weight <= 3) {
			System.out.println("The price is 5.5");
		} else if (3 < weight && weight <= 10) {
			System.out.println("The price is 8.5");
		} else if (10 < weight && weight <= 20) {
			System.out.println("The price is 10.5");
		} else {
			System.out.println("Your package can not be shipped.");
		}
	}

}
