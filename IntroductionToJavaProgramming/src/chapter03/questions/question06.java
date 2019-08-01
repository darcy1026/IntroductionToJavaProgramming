package chapter03.questions;

import java.util.Scanner;

public class question06 {

	public static void main(String[] args) {
		/*
		 * (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to
		 * let the user enter weight, feet, and inches. For example, if a person is 5
		 * feet and 10 inches, you will enter 5 for feet and 10 for inches. Here is a
		 * sample run:
		 */
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your weight in pounds: ");
		double weight = input.nextDouble();

		System.out.print("Enter your height in feet and in inches (ex: 7 10): ");
		double feet = input.nextDouble();
		double inches = input.nextDouble();

		double height = 12 * feet + inches;

		final double METER_PER_INCHES = 0.0254;
		final double KG_PER_POUND = 0.453592;

		final double BMI = (weight * KG_PER_POUND) / Math.pow(height * METER_PER_INCHES, 2);

		System.out.println("Your BMI is " + BMI + ".");

		if (BMI >= 30.0) {
			System.out.println("OBESE");
		} else if (25.0 <= BMI && BMI < 30.0) {
			System.out.println("OVERWEIGHT");
		} else if (18.5 <= BMI && BMI < 25.5) {
			System.out.println("NORMAL");
		} else {
			System.out.println("UNDERWEIGHT");
		}

	}

}
