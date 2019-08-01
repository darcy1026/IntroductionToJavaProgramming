package chapter05.questions;

import java.util.Scanner;

public class Question36 {

	public static void main(String[] args) {
		/*
		 * Use loops to simplify Programming Exercise 3.9.
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first 9 digits of your ISBN.");
		int ISBN = input.nextInt();
		System.out.println(ISBN);
		int finalISBN = ISBN;
		int digit = 0;
		int sum = 0;
		for (int i = 100_000_000, j = 1; 1 <= i && j <= 9; i = i / 10, j++) {

			digit = ISBN / i;
			ISBN %= i;
			digit = digit * j;
			sum += digit;
		}
		sum = sum % 11;
		if (sum != 10) {
			System.out.println("The ISBN - 10 number is " + finalISBN + sum);
		}else {
			System.out.println("The ISBN - 10 number is " + finalISBN + "X");
		}

	}

}
