package chapter06.questions;

import java.util.Scanner;

public class Question_37 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number and it's width: ");
		int number = input.nextInt();
		int width = input.nextInt();

		System.out.println(printFormat(number, width));
	}

	public static String printFormat(int number, int width) {
		String str = "";
		String num = number + "";
		if (num.length() < width) {
			int numberOfZeros = width - num.length();
			for (int i = 0; i < numberOfZeros; i++) {
				str += 0;
			}
			str += num;
			return str;
		} else
			return num;

	}

}
