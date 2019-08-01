package chapter05.questions;

public class Question03 {

	public static void main(String[] args) {
		/*
		 * (Conversion from kilograms to pounds) Write a program that displays the
		 * following table (note that 1 kilogram is 2.2 pounds):
		 */
		System.out.print("Kilograms\tPounds");

		double pound = 2.2;

		for (int i = 1; i < 200; i++) {
			System.out.printf("\n%d\t\t%6.1f", i, i * pound);
		}
	}

}
