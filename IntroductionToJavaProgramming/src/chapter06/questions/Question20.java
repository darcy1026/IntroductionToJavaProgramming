package chapter06.questions;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = input.nextLine();
		System.out.println("Number of letters in your str is: " + countLetters(str));
	}	
	public static int countLetters(String str) {
		int number = 0;
		for (int i = 0; i < str.length(); i++) {
			if(Character.isLetter(str.charAt(i))) {
				number++;
			}
		}
		return number;
	}
}
