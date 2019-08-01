package chapter04.questions;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		/*
		 * (Check SSN) Write a program that prompts the user to enter a Social Security
		 * number in the format DDD-DD-DDDD, where D is a digit. Your program should
		 * check whether the input is valid.
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a SSN(DDD-DD-DDDD): ");
		String ssn = input.nextLine();

		boolean valid = (ssn.length() == 11) && (Character.isDigit(ssn.charAt(0)))
				&& (Character.isDigit(ssn.charAt(1))) && (Character.isDigit(ssn.charAt(2)))
				&& (ssn.charAt(3) == '-') && (Character.isDigit(ssn.charAt(4)))
				&& (Character.isDigit(ssn.charAt(5))) && (ssn.charAt(6) == '-') && (Character.isDigit(ssn.charAt(7)))
				&& (Character.isDigit(ssn.charAt(8))) && (Character.isDigit(ssn.charAt(9)))
				&& (Character.isDigit(ssn.charAt(10)));
		if (valid) {
			System.out.println(ssn + " is a valid social security number.");
		} else {
			System.out.println(ssn + " is an invalid social security number.");
		}

	}

}
