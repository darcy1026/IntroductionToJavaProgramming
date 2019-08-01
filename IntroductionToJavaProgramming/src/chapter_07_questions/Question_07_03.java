package chapter_07_questions;

import java.util.Scanner;

public class Question_07_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integers between 1 and 100: ");
		int[] number = new int[100];

		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextInt();
			if (number[i] == 0) {
				break;
			}
		}

		int[] count = new int[number.length];

		for (int i = 0; i < number.length; i++) {
			count[number[i]]++;

		}

		for (int i = 0; i < number.length; i++) {
			if (number[i] == 0) {
				break;
			} else {
				System.out.println(
						number[i] + " occurs " + count[number[i]] + ((count[number[i]] >= 2) ? " times." : " time."));
			}
		}
	}

}
