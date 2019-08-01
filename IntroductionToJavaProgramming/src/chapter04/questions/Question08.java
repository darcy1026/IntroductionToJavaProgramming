package chapter04.questions;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		/*
		 * (Find the character of an ASCII code) Write a program that receives an ASCII
		 * code (an integer between 0 and 127) and displays its character. Here is a
		 * sample run:
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an ASCII code (Between 0 and 127): ");

		int code = input.nextInt();

		char ch = (char) code;

		System.out.println("The character for ASCII code " + code + " is " + ch);
		
		//System.out.println((char)code);

	}

}
