package chapter05.questions;

import java.util.Scanner;

public class Question38 {

	public static void main(String[] args) {
		/*
		 * (Decimal to octal) Write a program that prompts the user to enter a decimal
		 * integer and displays its corresponding octal value. Don’t use Java’s Integer
		 * .toOctalString(int) in this program.
		 */

		Scanner input = new Scanner(System.in);
		for (int i = 1; i <= 100; i++) {
			String octal = "";
			System.out.print("Enter a decimal value: ");
			int decimal = input.nextInt();
			
			for (int j = decimal; j >= 1; j /= 8) {
				octal = (j % 8) + octal; 
			}
			System.out.println(octal);
		}

	}

}
