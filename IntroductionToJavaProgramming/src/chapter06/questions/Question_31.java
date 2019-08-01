package chapter06.questions;

import java.util.Scanner;

public class Question_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a credit card number as a long integer: ");
		long n = input.nextLong();

		if (!isValid(n)) {
			System.out.println("Invalid card number");
			System.exit(1);
		} else if ((checkDigitsEven(n) + checkDigitsOdd(n)) % 10 == 0) {
			System.out.println(n + " is valid");
		} else {
			System.out.println(n + " is invalid");
		}
	}

	public static int checkDigitsOdd(long n) {
		int sum = 0;
		for (long i = n; 0 < i; i /= 100) {
			long m = i;
			m %= 10;
			sum += m;
		}
		return sum;
	}

	public static int checkDigitsEven(long n) {

		n = n / 10;
		int sum = 0;
		for (long i = n; 0 < i; i /= 100) {
			long m = i;
			m %= 10;
			m = m * 2;
			m = checkM(m);
			sum += m;
		}
		return sum;
	}

	public static int checkM(long m) {
		int temp = (int)m;
		String num = m + "";
		if (num.length() > 1)
			return (int) (temp / 10 + temp % 10);
		else
			return (int) temp;
	}

	public static boolean isValid(long n) {
		String num = n + "";
		if (num.length() <= 16 && num.length() >= 13)
			return true;
		else
			return false;
	}
}