package chapter05.questions;

import java.util.Scanner;

public class Question50DIA {

	public static void main(String[] args) {
		/*
		 * (Count uppercase letters) Write a program that prompts the user to enter a
		 * string and displays the number of the uppercase letters in the string.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = input.nextLine();
		
		int numberOfUpperCase = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int integerValueOfCharacter = ch;
			
			if(integerValueOfCharacter < 91 && integerValueOfCharacter > 64) {
				numberOfUpperCase++;
			}
		}

		System.out.println("Number of upper case is: " + numberOfUpperCase);
	}

}
