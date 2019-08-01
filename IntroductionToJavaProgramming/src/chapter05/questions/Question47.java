package chapter05.questions;

import java.util.Scanner;

public class Question47 {

	public static void main(String[] args) {
		/*
		 * (Business: check ISBN-13) ISBN-13 is a new standard for indentifying books.
		 * It uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a
		 * checksum, which is calculated from the other digits using the following
		 * formula
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
		String str = input.nextLine();

		String digit = "";
		int intValue;
		int sum = 0;
		for (int i = str.length() - 1, j = i - 1; i >= 0 && j >= 0 ; i -= 2, j -= 2) {
			digit = "";
			digit += str.charAt(i);
			intValue = Integer.parseInt(digit);
			intValue = intValue * 3; 
			sum += intValue;
			digit = "";
			digit += str.charAt(j);
			intValue = Integer.parseInt(digit);
			sum += intValue;	
		}
		int finNumber = 10 - (sum % 10);
		System.out.println("your 13 digit ISBN is: " + str + finNumber);
	}

}
