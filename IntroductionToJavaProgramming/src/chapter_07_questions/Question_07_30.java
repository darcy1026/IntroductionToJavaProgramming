package chapter_07_questions;

import java.util.Scanner;

public class Question_07_30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of values: ");
		int length = input.nextInt();
		int[] value = new int[length];

		System.out.println("Enter the values: ");
		for (int i = 0; i < value.length; i++) {
			value[i] = input.nextInt();
		}
		if (isConsecutiveFour(value)) {
			System.out.println("The list has consecutive fours");
		} else {
			System.out.println("The list has no consecutive fours");
		}

	}

	public static boolean isConsecutiveFour(int[] value) {
		int count = 0;
		for (int i = 1, j = 0; i < value.length; i++, j++) {
			if (value[i] == value[j])
				count++;
		}
		if (count >= 3) {
			return true;
		} else {
			return false;
		}
	}

}
