package chapter06.questions;

import java.util.Scanner;

public class Question21_I_DID_LIKE_IT {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a str: ");
		String str = input.nextLine();
		
		String number = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(Character.isLetter(str.charAt(i))){
				ch = Character.toUpperCase(ch);
				number += getNumber(ch);
			}else if(Character.isDigit(str.charAt(i))) {
				number += ch;
			}else if(!Character.isLetterOrDigit(str.charAt(i))) {
				number += ch;
			}
		}
		System.out.println(number);
		
	}

	public static int getNumber(char ch) {
		if (Character.isLetter(ch)) {
			if ('W' <= ch)
				ch = 9;
			else if ('T' <= ch)
				ch = 8;
			else if ('P' <= ch)
				ch = 7;
			else if ('M' <= ch)
				ch = 6;
			else if ('J' <= ch)
				ch = 5;
			else if ('G' <= ch)
				ch = 4;
			else if ('D' <= ch)
				ch = 3;
			else if ('A' <= ch)
				ch = 2;
		}
		return ch;
	}
}
