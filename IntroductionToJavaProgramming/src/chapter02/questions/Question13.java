package chapter02.questions;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		/*
		 * ( Financial application: compound value) Suppose you save $100 each month
		 * into a savings account with the annual interest rate 5%. Thus, the monthly
		 * interest rate is 0.05/12 = 0.00417. After the first month, the value in the
		 * account becomes javaci.net javaci.net 100 * (1 + 0.00417) = 100.417 After the
		 * second month, the value in the account becomes (100 + 100.417) * (1 +
		 * 0.00417) = 201.252 After the third month, the value in the account becomes
		 * (100 + 201.252) * (1 + 0.00417) = 302.507 and so on. Write a program that
		 * prompts the user to enter a monthly saving amount and displays the account
		 * value after the sixth month. (In Exercise 5.30, you will use a loop to
		 * simplify the code and display the account value for any month.)
		 */
		Scanner input = new Scanner(System.in);

		System.out.println(
				"With 5% annual interest rate how much you would like to deposit in your saving account. \nI can tell "
						+ "you the total amount end of the sixth month.");

		System.out.println("Please enter an amount.");
		double savingAmount = input.nextDouble();

		final double RATE = (1 + 0.00417);
		double monthFirst = savingAmount * RATE;
		double monthSecond = (savingAmount + monthFirst) * RATE;
		double monthThird = (savingAmount + monthSecond) * RATE;
		double monthForth = (savingAmount + monthThird) * RATE;
		double monthFifth = (savingAmount + monthForth) * RATE;
		double monthSixth = (savingAmount + monthFifth) * RATE;

		System.out.println("After the sixth month, the account value is " + monthSixth);

	}

}
