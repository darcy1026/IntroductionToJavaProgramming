package chapter05.questions;

import java.util.Scanner;

public class Question0101 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer, the input ends if it is 0: ");
		int integer = input.nextInt();

		int positive = 0;
		int negative = 0;
		int sum = 0;

		int count = 0;
		while (integer != 0) {
			integer = input.nextInt();
			count++;
		}
		System.exit(1);

	}
}
