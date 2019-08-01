package chapter04.questions;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		/*
		 * (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.
		 * java, to fix the possible loss of accuracy when converting a float value to
		 * an int value. Read the input as a string such as "11.56". Your program should
		 * extract the dollar amount before the decimal point and the cents after the
		 * decimal amount using the indexOf and substring methods.
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the amount of money (ex 67.87):");
		String amount = input.nextLine();

		int k = amount.indexOf('.');
		String oneDollars = amount.substring(0, k);
		String cents = amount.substring(k + 1);

		int centsInt = Integer.parseInt(cents);
		int quarters = centsInt / 25;
		int dimes = centsInt % 25;
		int totalDimes = dimes / 10;
		int nickel = dimes % 10;
		int totalNickel = nickel / 5;
		int finalCents = nickel % 5;

		System.out.printf("You have %s one dollars %d quarters %d dimes %d nickels %d one cents.", oneDollars, quarters,
				totalDimes, nickel, finalCents);

	}

}
