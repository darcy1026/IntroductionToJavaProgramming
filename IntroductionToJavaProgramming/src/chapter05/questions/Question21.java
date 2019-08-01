package chapter05.questions;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		/*
		 * (Financial application: compare loans with various interest rates) Write a
		 * program that lets the user enter the loan amount and loan period in number of
		 * years and displays the monthly and total payments for each interest rate
		 * starting from 5% to 8%, with an increment of 1/8. Here is a sample run:
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the loan amount.");
		double loan = input.nextInt();
		System.out.println("Enter the years.");
		int year = input.nextInt();

		System.out.print("INTEREST RATE\t");
		System.out.print("MONTHLY PAYMENT\t   ");
		System.out.print("    TOTAL PAYMENT");
		int count = 1;
		double rate = 0.05;

		for (double i = 5.0; i <= 8.0; i += 0.125) {
			// I have taken the formula below from https://en.wikipedia.org/wiki/Mortgage_calculator
			double monthlyPayment = ((rate/12) * loan) / (1 - Math.pow(1 + (rate/12), -1 * year * 12));//rate (monthly rate so divided by 12) 
			double totalPayment = monthlyPayment * 12 * year;
			System.out.printf("\n%.3f%c\t\t%.2f\t\t\t%.2f\t%d", i, '%', monthlyPayment, totalPayment, count);
			count++;
			rate = rate + 0.00125;
		}

	}

}
