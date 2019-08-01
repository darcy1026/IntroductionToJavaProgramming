package chapter05.questions;

import java.util.Scanner;

public class Question30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an amount: ");
		double amount = input.nextDouble();
		System.out.println("Enter the rate: ");
		double rate = input.nextInt();
		System.out.println("Enter the number of months: ");
		double month = input.nextInt();
		
		double endOfNext = 0;
		double monthlyRate = rate / 1200;
		double endOfMonth = 0;
		
		for (double i = 1; i <= month; i++) {
			endOfMonth = (monthlyRate + 1) * (amount + endOfNext);
			System.out.printf("%.3f\n", endOfMonth);
			endOfNext = endOfMonth;
		}
	
	}

}
