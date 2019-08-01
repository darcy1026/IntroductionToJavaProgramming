package chapter_07_questions;

import java.util.Scanner;

public class Question_07_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] numbers = new int[100];

		System.out.println("Enter some integers, finish with a negative.");

		// getTheNumbers(numbers);

		int sum = 0;
		double count = 0;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
			if (numbers[i] > 0) {
				sum += numbers[i];
				count++;
			}
			if (numbers[i] < 0) {
				break;
			}
		}

		double average = sum / count;

		int countAbove = 0;
		int countBelow = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				if (numbers[i] >= average) {
					countAbove++;
				} else {
					countBelow++;
				}
			}

		}
		System.out.println(countAbove + " numbers aboveOrequal the average");
		System.out.println(countBelow + " numbers below the average");

	}

}
