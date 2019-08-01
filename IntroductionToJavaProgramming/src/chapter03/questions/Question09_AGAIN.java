 package chapter03.questions;

import java.util.Scanner;

public class Question09_AGAIN {

	public static void main(String[] args) {
		/*
		 * (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
		 * consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a
		 * checksum, which is calculated from the other nine digits using the following
		 * formula: (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 *
		 * 8 + d9 * 9) % 11 If the checksum is 10, the last digit is denoted as X
		 * according to the ISBN-10 convention. Write a program that prompts the user to
		 * enter the first 9 digits and displays the 10-digit ISBN (including leading
		 * zeros). Your program should read the input as an integer. Here are sample
		 * runs:
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first digits of an ISBN as integer: ");
		int isbn = input.nextInt();
		
		int d1 = isbn / 100_000_000;
		int remainingDigits = isbn % 100_000_000;
		
		int d2 = remainingDigits / 10_000_000;
		remainingDigits %= 10_000_000;
		
		int d3 = remainingDigits / 1_000_000;
		remainingDigits %= 1_000_000;
				
		int d4 = remainingDigits / 100_000;
		remainingDigits %= 100_000;		
				
		int d5 = remainingDigits / 10_000;
		remainingDigits %= 10_000;
		
		int d6 = remainingDigits / 1000;
		remainingDigits %= 1000;
		
		int d7 = remainingDigits / 100;
		remainingDigits %= 100;
		
		int d8 = remainingDigits / 10;
		remainingDigits %= 10;
		
		int d9 = remainingDigits;
		
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		if (d10 == 10) {
		
		System.out.println("The ISBN-10 number is " + d1+d2+d3+d4+d5+d6+d7+d8+d9+"X");
		
		}else {
			System.out.println("The ISBN-10 number is " + d1+d2+d3+d4+d5+d6+d7+d8+d9+d10);
		}
		

	}

}
