package chapter_07_questions;

import java.util.Scanner;

public class Question_07_19 {

	public static void main(String[] args) {
		System.out.print("Enter list: ");
		Scanner input = new Scanner(System.in);
		int firstNumber = input.nextInt();
		int[] number = new int[firstNumber];
		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextInt();
		}

		System.out.println("The list is " + (isSorted(number) ? "" : "not") + "already sorted.");
	}

	public static boolean isSorted(int[] number) {
		for (int i = 0; i < number.length; i++) {
			int currentMin = number[i];
			int currentMinIndex = i;
			for (int j = i + 1; j < number.length; j++) {
				if (currentMin > number[j]) {
					currentMin = number[j];
					currentMinIndex = j;
				}
			}
			if (currentMin != number[i]) {
				return false;
			}
		}
		return true;
	}
}
