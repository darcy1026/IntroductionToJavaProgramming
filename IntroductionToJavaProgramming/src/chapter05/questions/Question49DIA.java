package chapter05.questions;

import java.util.Scanner;

public class Question49DIA {

	public static void main(String[] args) {
		/*
		 * (Count vowels and consonants) Assume letters A, E, I, O, and U as the vowels.
		 * Write a program that prompts the user to enter a string and displays the
		 * number of vowels and consonants in the string.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a str");
		String str = input.nextLine();

		int vowels = 0;
		int consonants = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				if (Character.toUpperCase(str.charAt(i)) == 'A' || Character.toUpperCase(str.charAt(i)) == 'E'
						|| Character.toUpperCase(str.charAt(i)) == 'I' || Character.toUpperCase(str.charAt(i)) == 'O'
						|| Character.toUpperCase(str.charAt(i)) == 'U') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("The number of vowels is: " + vowels);
		System.out.println("The number of consonants is: " + consonants);
	}
}
