package chapter06.questions;

import java.util.Scanner;

public class Question02_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a long number: ");
		long myNumber = input.nextLong();
		System.out.println("Your number is : " + myNumber);
		int sumOfDigits = sumDigits(myNumber);
		System.out.println("The sum of digits is : " + sumOfDigits );
	}

	private static int sumDigits(long myNumber) {
		int result = 0;
		for (long i = myNumber; i >= 1; i /= 10) {
			result += i % 10;
		}
		return result;
	}

}
