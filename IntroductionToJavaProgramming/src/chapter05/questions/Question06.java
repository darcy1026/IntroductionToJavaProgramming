package chapter05.questions;

public class Question06 {

	public static void main(String[] args) {
		/*
		 * (Conversion from miles to kilometers) Write a program that displays the
		 * following two tables side by side:
		 */
		System.out.print("Miles\tKilometers   |   Kilometers\tMiles");// 3 spaces were used
		
		double mileToKm = 1.609;
		double kmToMile = 0.621371;
		
		for (int i = 1, j = 20; i < 11 && j < 66; i++, j += 5) {
			System.out.printf("\n%d\t%.3f", i, i * mileToKm);
			System.out.print("\t     |   ");// 1 tab and 5 spaces
			System.out.printf("%d\t\t%.3f", j, j * kmToMile);
		}
	}

}
