package chapter05.questions;

import java.util.Scanner;

public class Question48 {

	public static void main(String[] args) {
		/*
		 * (Process string) Write a program that prompts the user to enter a string and
		 * displays the characters at odd positions.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a str: ");
		String str = input.nextLine();
		
		String abc = "";
		for (int i = 0; i < str.length(); i += 2) {
			abc += str.charAt(i);
		}
		System.out.println(abc);
	}

}
