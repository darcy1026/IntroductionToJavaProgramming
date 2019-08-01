package chapter04.questions;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
		/*
		 * (Find the Unicode of a character) Write a program that receives a character
		 * and displays its Unicode. Here is a sample run:
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		
		String userCh = input.next();
		
		char ch = userCh.charAt(0);
		
		System.out.println("The Unicode for the character " + userCh + " is " + (int)ch);
		
	}

}
