package chapter06.questions;

import java.util.Scanner;

public class Question07DIA {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the invest amount: ");
		double invest = input.nextDouble();
		System.out.println("Enter the annual interest rate: ");
		double interest = input.nextDouble();
		System.out.println("Enter the year: ");
		int years = input.nextInt();
		System.out.println("Years\tFuture Value");
		futureValueInYears(invest, interest, years);

	}

	public static double futureValueInYears(double invest, double interest, int years) {
		double futureValue = 0;
		for (int i = 1; i <= years; i++) {
			futureValue = invest * Math.pow(1 + interest / 1200, 12 * i);// i displays the years in order.
			System.out.printf("%d\t%.2f\n", i, futureValue);
		}
		return futureValue;
	}
}
