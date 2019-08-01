 package chapter04.questions;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		/*
		 * Phone key pads) The international standard letter/number mapping found on the
		 * telephone is shown below: Write a program that prompts the user to enter a
		 * letter and displays its corresponding number.
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a letter: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		ch = Character.toUpperCase(ch);

		if (s.length() != 1) {
			System.out.println("Invalid input");
			System.exit(1);
		}
		
		int number = 0;
		if (Character.isLetter(ch)) {
			if ('W' <= ch)
				number = 9;
			else if ('T' <= ch)
				number = 8;
			else if ('P' <= ch)
				number = 7;
			else if ('M' <= ch)
				number = 6;
			else if ('J' <= ch)
				number = 5;
			else if ('G' <= ch)
				number = 4;
			else if ('D' <= ch)
				number = 3;
			else if ('A' <= ch)
				number = 2;
			System.out.println("The corresponding number is " + number);
		} else {
			System.out.println(ch + " invalid input!");
		}
	}

}
