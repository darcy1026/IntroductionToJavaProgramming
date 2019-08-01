package chapter06.questions;

import java.util.Scanner;

public class Question23_I_DID_LIKE_IT {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string and a letter from the string: ");
		String str1 = input.next();
		String chInput = input.next();
		
		str1 = str1.toUpperCase();
		chInput = chInput.toUpperCase();
		char ch = chInput.charAt(0);
		
		System.out.print(count(str1, ch));
	}
	public static int count(String str1, char ch) {
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
			char ch1 = str1.charAt(i);
			if(ch1 == ch) {
				count++;
			}
		}
		return count;
	}
}
