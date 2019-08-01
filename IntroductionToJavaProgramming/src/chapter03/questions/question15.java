package chapter03.questions;

import java.util.Scanner;

public class question15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number = (int) (Math.random() * 900) + 100;

		System.out.print("Enter a three digit number: ");

		int guess = input.nextInt();

		int numberFirstDigit = number / 100;
		int numberSecondDigit = (number % 100) / 10;
		int numberThirdDigit = number % 10;

		int guessFirstDigit = guess / 100;
		int guessSecondDigit = (guess % 100) / 10;
		int guessThirdDigit = guess % 10;

		System.out.println("You have entered " + guess + " the computer has picked " + number);

		if (guessFirstDigit == numberFirstDigit && guessSecondDigit == numberSecondDigit
				&& guessThirdDigit == numberThirdDigit) {
			System.out.println("You won $10_000");
		} else if (guessFirstDigit == numberFirstDigit || guessFirstDigit == numberSecondDigit
				|| guessFirstDigit == numberThirdDigit || guessSecondDigit == numberFirstDigit
				|| guessSecondDigit == numberSecondDigit || guessSecondDigit == numberThirdDigit
				|| guessThirdDigit == numberFirstDigit || guessThirdDigit == numberSecondDigit
				|| guessThirdDigit == numberThirdDigit) {
			System.out.println("You won $1_000");

		} else if (guessFirstDigit == numberFirstDigit || guessFirstDigit == numberSecondDigit
				|| guessFirstDigit == numberThirdDigit && guessSecondDigit == numberFirstDigit
				|| guessSecondDigit == numberSecondDigit
				|| guessSecondDigit == numberThirdDigit && guessThirdDigit == numberFirstDigit
				|| guessThirdDigit == numberSecondDigit || guessThirdDigit == numberThirdDigit) {
			System.out.println("You won $2_000");
		} else {
			System.out.println("You did not win.");
		}

	}

}
