package chapter05.questions;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		/*
		 * (Display pyramid) Write a program that prompts the user to enter an integer
		 * from 1 to 15 and displays a pyramid,
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number between 1 and 15: ");
		int numberOfLines = 7;
		
		for (int i = 1; i < numberOfLines + 1; i++) {
			for (int j = numberOfLines - i; j > 0; j--) {
				System.out.print("  ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print(" " + j);
			}
			for (int l = 2; l < i + 1; l++) {
				System.out.print(" " + l);
			}
			System.out.println();
		}
		
	}

}
