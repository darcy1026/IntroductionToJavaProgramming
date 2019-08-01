package chapter04.questions;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		/*
		 * (Check substring) Write a program that prompts the user to enter two strings
		 * and reports whether the second string is a substring of the first string.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter string s1 and s2: ");
		String str = input.nextLine();
		
		int k =str.indexOf(' ');
		String first = str.substring(0, k);
		String second = str.substring(k + 1);
		
		boolean substring = (first.contains(second));
		
		System.out.println(second + " is" + ((substring) ? " " : " not ") + "a substring of " + first);
		
		
		
		
	}

}
