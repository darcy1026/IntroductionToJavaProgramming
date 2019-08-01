package chapter05.questions;

public class Question04 {

	public static void main(String[] args) {
		/*
		 * (Conversion from miles to kilometers) Write a program that displays the
		 * following table (note that 1 mile is 1.609 kilometers):
		 */
		System.out.print("Miles\t\tKilometers");
		
		double mileToKilometers = 1.609;
		
		for (int i = 1; i < 11; i++) {
			System.out.printf("\n%d\t\t%.3f", i, i * mileToKilometers);
		}
	}

}
