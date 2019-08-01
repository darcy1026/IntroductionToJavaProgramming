package chapter_07_questions;

import java.util.Scanner;

public class Question_07_12 {

	public static void main(String[] args) {

		int[] number = new int[10];

		System.out.println("Enter ten numbers: ");
		print(getNumbers(number));
		System.out.println();
		print(getReverse(number));
	}

	private static void print(int[] arrayPrint) {
		for (int i = 0; i < arrayPrint.length; i++) {
			System.out.print(arrayPrint[i] + " ");
		}
	}

	public static int[] getReverse(int[] number) {
		int[] reverse = new int[number.length];
		for (int i = 0, j = number.length - 1; i < reverse.length; i++, j--) {
				reverse[j] = number[i];
		}
		return reverse;
	}

	public static int[] getNumbers(int[] number) {
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextInt();
		}
		return number;
	}

}
