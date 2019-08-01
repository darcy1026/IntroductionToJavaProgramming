package chapter05.questions;

import java.util.Scanner;

public class Question43 {

	public static void main(String[] args) {
		/*
		 * (Math: combinations) Write a program that displays all possible combinations
		 * for picking two numbers from integers 1 to 7. Also display the total number
		 * of all combinations.
		 */
		int numberPerLine = 7;
		int count = 0;
		for (int i = 1; i <= 7; i++) {
			for (int j = i + 1; j <= 7; j++) {
				String str = i + "," + j;
				count++;
				if (count % numberPerLine == 0) {
					System.out.print("(" + str + ")\n");
				} else {
					System.out.print("(" + str + ")");
				}

			}

		}
		System.out.println("\nThe total number of all combination is: " + count + ".");
	}

}
