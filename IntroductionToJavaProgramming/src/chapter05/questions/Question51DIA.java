package chapter05.questions;

import java.util.Scanner;

public class Question51DIA {

	public static void main(String[] args) {
		/*
		 * (Longest common prefix) Write a program that prompts the user to enter two
		 * strings and displays the largest common prefix of the two strings.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first str: ");
		String str1 = input.nextLine();
		System.out.println("Enter the second str: ");
		String str2 = input.nextLine();		
		
		String commonPrefix = "";
		for (int i = 0,j = 0; i < str1.length() && j < str2.length(); i++, j++) {
			if(str1.charAt(i) == str2.charAt(j)) {
				commonPrefix += str1.charAt(i);
			}
		}
		System.out.println("The common prefix is " + commonPrefix);
	}

}
