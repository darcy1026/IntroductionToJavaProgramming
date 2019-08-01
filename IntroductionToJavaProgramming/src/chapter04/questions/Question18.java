package chapter04.questions;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		/*
		 * (Student major and status) Write a program that prompts the user to enter two
		 * characters and displays the major and status represented in the characters.
		 * The first character indicates the major and the second is number character 1,
		 * 2, 3, 4, which indicates whether a student is a freshman, sophomore, junior,
		 * or senior. Suppose the following characters are used to denote the majors: M:
		 * Mathematics C: Computer Science I: Information Technology
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two characters: ");
		
		String str = input.nextLine();
		
		char ch = str.charAt(0);
		ch = Character.toUpperCase(ch);
		char number = str.charAt(1);
		
		switch (ch) {
		case 'M':System.out.print("Mathematics ");break;
		case 'C':System.out.print("Computer Science ");break;
		case 'I':System.out.print("Information Technology ");break;
		default:System.out.println("Invalid input.");System.exit(1);
		}
		
		switch (number) {
		case '1':System.out.println("Freshman");break;
		case '2':System.out.println("Sophomore");break;
		case '3':System.out.println("Junior");break;
		case '4':System.out.println("Senior");System.exit(1);

		}
	}
}
