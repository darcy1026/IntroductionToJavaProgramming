package chapter05.questions;

import java.util.Scanner;

public class Question46 {

	public static void main(String[] args) {
		/*
		 * (Reverse a string) Write a program that prompts the user to enter a string
		 * and displays the string in reverse order.
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		System.out.println(reverse);
	}

}
