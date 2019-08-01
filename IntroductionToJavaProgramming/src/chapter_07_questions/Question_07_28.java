package chapter_07_questions;

import java.util.Scanner;

public class Question_07_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten integer: ");
		int[] number = new int[10];
		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextInt();
		}
		printCombination(number);
	}

	public static void printCombination(int[] number) {
		for (int i = 0; i < number.length; i++) {
			int n = 1;
			for (int j = 0; j < number.length; j++) {
				if (number[i] != number[j]) {
					System.out.print(number[i] + "," + number[j] + "  ");
					n++;
					if (n % 10 == 0) {
						System.out.println();
					}

				}
			}

		}
	}

}
