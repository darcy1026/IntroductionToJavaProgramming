package chapter06.questions;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		
		int n = 100;
		int pentagonalNumber = 0;
		for (int i = 1; i <= n; i++) {
			pentagonalNumber = pentagonalNumber(i);
			System.out.println(i + "." + " penatgonal number is: " + pentagonalNumber);
		}
	}

	private static int pentagonalNumber(int number) {
		int result;
		
		result = number * (3 * number - 1) / 2;
		
		return result;
	}

}
