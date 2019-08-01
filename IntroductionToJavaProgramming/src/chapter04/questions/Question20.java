package chapter04.questions;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		/*
		 * (Process a string) Write a program that prompts the user to enter a string
		 * and displays its length and its first character.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter something: ");
		String str = input.nextLine();
		
		int length = str.length();
		char ch = str.charAt(0);
		
		System.out.println("Your input length is " + length + " and your first character is " + ch);
		
	}

}
