package chapter06.questions;

import java.util.Scanner;

public class Question18_I_DID_LIKE_IT {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String password = input.nextLine();

		System.out.print(passwordCheck1(password) && passwordCheck2(password) ? "Valid password" : "Invalid password");
	}

	public static boolean passwordCheck1(String password) {
		if (password.length() != 8) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean passwordCheck2(String password) {
		int number = 0;
		int letter = 0;
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			if ('0' <= ch && ch <= '9') {
				number++;
			}
			if (ch <= 'A' && ch >= 'z') {
				letter++;
			}
		}
		if (letter > 0 || number < 2) {
			return false;
		} else {
			return true;
		}
	}
}
