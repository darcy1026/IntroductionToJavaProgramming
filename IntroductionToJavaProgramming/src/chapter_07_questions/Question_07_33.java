package chapter_07_questions;

import java.util.Scanner;

public class Question_07_33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] zodiacs = {"monkey","rooster","dog","pig","rat","ox","tiger","rabbit"
				+ "dragon","snake","horse","sheep"};
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		System.out.print(zodiacs[year % 12]);
	}

}
