package chapter05.questions;

public class Question05 {

	public static void main(String[] args) {
		/*
		 * (Conversion from kilograms to pounds and pounds to kilograms) Write a program
		 * that displays the following two tables side by side:
		 */
		System.out.print("Kilograms\tPounds\t|   Pounds      Kilograms");

		double kgToPound = 2.2;
		double poundToKg = 0.453592;

		for (int i = 1, j = 20; i < 200 && j < 516; i += 2, j += 5) {
			System.out.printf("\n%d\t\t%5.1f\t", i, i * kgToPound);
			System.out.print("|");
			System.out.printf("   %d\t\t%8.2f", j, j * poundToKg);
		}

	}

}
