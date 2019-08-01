package chapter06.questions;

import java.util.Scanner;

public class Question22_I_DID_LIKE_IT {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();

		System.out.printf("Your app. value is: %.4f", sqrt(number));
	}

	public static double sqrt(double number) {

		double lastGuess = 1;
		double nextGuess = (lastGuess + number / lastGuess) / 2;
		while (Math.abs(lastGuess - nextGuess) > 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + number / lastGuess) / 2;
		}
		return nextGuess;
	}
}
