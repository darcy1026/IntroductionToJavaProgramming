package chapter04.questions;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		/*
		 * (Decimal to hex) Write a program that prompts the user to enter an integer
		 * between 0 and 15 and displays its corresponding hex number. Here are some
		 * sample runs:
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a decimal value (0 to 15)");
		
		int number = input.nextInt();
		
		if (0 <= number && number <=9) {
			System.out.println("The Hex value is " + number);
		}else if (10 <= number && number <= 15) {
			System.out.println("The Hex value is " + (char)(number + 'A' - 10));
		}else {
			System.out.println(number + " is an invalid input.");
			
		}
		
		
	}

}
