package chapter05.questions;

import java.util.Scanner;

public class Question41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter numbers");
		int max = input.nextInt();
		int number;

		int count = 1;
		for (int i = 1; i <= 5; i++) {
			number = input.nextInt();
			if (number > max) {
				max = number;
				count = 1;
			}
			else if (number == max) {
				count++;
			}

		}
		System.out.println("Your largest number is: " + max);
		System.out.println("Its occurrence is " + count);
	}

}
