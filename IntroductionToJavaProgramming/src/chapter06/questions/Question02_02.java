package chapter06.questions;

import java.util.Scanner;

public class Question02_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a long number: ");
		long number = input.nextLong();

		System.out.println("Your long number is: " + number + " and the sum of digits is: " + sumDigits(number));

	}

	public static int sumDigits(long number) {
		int sum = 0;
		while (number >= 1) {
			sum += number % 10;
			number /= 10;
			}
		return sum;
	}

}
