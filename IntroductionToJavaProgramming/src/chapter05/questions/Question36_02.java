package chapter05.questions;

import java.util.Scanner;

public class Question36_02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 digit of ISBN number:");
		String isbn = input.nextLine();
		int d10 = 0;
		for (int i = 0; i < 9; i++) {
			d10 += Integer.parseInt(isbn.charAt(i) + "") * (i + 1);
		}
		d10 %= 11;
		for (int j = 1; j <= 9; j++) {
			System.out.println(isbn.charAt(j));
		}
		
	}

}
