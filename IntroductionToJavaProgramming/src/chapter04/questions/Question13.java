package chapter04.questions;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		/*
		 * (Vowel or consonant?) Write a program that prompts the user to enter a letter
		 * and check whether the letter is a vowel or consonant. Here is a sample run:
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter: ");
		
		String s = input.nextLine();
		
		if (s.length() != 1) {
			System.out.println("Invalid input");
			System.exit(1);
		}
		
		char ch = s.charAt(0);
		
		if (Character.isLetter(ch)) {
			switch (Character.toUpperCase(ch)) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':System.out.println(ch + 
					
					" is a vowel."); break;
			default:System.out.println(ch + " is a consonant");
			}
		}else {
			System.out.println("Invalid input.");
		}
		
		
	}

}
