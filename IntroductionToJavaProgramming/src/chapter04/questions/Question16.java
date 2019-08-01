package chapter04.questions;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		/*
		 * (Random character) Write a program that displays a random uppercase letter
		 * using the Math.random() method.
		 */
		
		int number = 65 + (int)(Math.random() * (91 - 65));
		
		System.out.println(number);
		
		System.out.println((char)(number));
		
	}

}
