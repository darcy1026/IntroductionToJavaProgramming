package chapter06.questions;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int n = input.nextInt();

		printMatrix(n);
	}

	public static void printMatrix(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int random = (int)(10 * Math.random()) % 2;
				System.out.printf("%-3d", random);
			}
			System.out.println();
		}
	}

}
