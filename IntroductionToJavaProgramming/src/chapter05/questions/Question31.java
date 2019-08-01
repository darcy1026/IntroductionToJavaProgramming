package chapter05.questions;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount, annual rate, and month: ");
		double amount = input.nextDouble();
		double rate = input.nextDouble();
		double month = input.nextDouble();

		double monthlyRate = rate / 1200;
		System.out.print("Month\tCD Value");
		double endOfNext = 0;
		for (int i = 1; i <= month; i++) {
		endOfNext = (monthlyRate + 1) * amount;
		System.out.printf("\n%d\t%.2f", i, endOfNext);
		amount = endOfNext;
		}

	}

}
