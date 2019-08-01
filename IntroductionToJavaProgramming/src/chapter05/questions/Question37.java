package chapter05.questions;

import java.util.Scanner;

public class Question37 {

	public static void main(String[] args) {
		/*
		 * (Decimal to binary) Write a program that prompts the user to enter a decimal
		 * integer and displays its corresponding binary value. Don’t use Java’s Integer
		 * .toBinaryString(int) in this program.
		 */
		Scanner input = new Scanner(System.in);
		
		String binary = "";
		for (int l = 1; l < 10; l++) {
			binary = "";
			System.out.print("Enter an integer: ");
			int decimal = input.nextInt();
			
			for (int i = decimal; i >= 1; i /= 2) {
				binary = (i % 2) + binary;
			}
			System.out.println(binary);
		}
		
	}

}
