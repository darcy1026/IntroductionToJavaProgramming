package chapter_08_questions;

import java.util.Scanner;

public class Question_08_11 {

	public static void main(String[] args) {
		// heads = 0 = H;
		// tails = 1 = T;
		System.out.print("Enter a number between 0 and 511: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		int[][] binary = convertToBinary(number);
		print1(binary);
		System.out.println("========");
		print(binary);
	}

	public static int[][] convertToBinary(int n) {
		int[][] array = new int[3][3];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = n % 2;
				n /= 2;
			}
		}
		return array;
	}

	public static void print1(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] == 1 ? "T " : "H ");
			}
			System.out.println();
		}
	}
}
