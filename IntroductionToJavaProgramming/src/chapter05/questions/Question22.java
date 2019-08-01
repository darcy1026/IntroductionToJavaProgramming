package chapter05.questions;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the loan amount: ");
		double loan = input.nextDouble();
		System.out.println("Enter the year: ");
		int year = input.nextInt();
		System.out.println("Enter the annual interest rate: ");
		double rate = input.nextDouble();
		
		double monthlyPayment = ((rate / 1200) * loan) / (1 - Math.pow(1 + rate / 1200, -1 * year * 12));
		double totalPayment = monthlyPayment * 12 * year;
		System.out.println("Monthly Payment is: " + monthlyPayment + "\nTotal Payment is: " + totalPayment);
		System.out.println("Payment#\tPrinciple\tInterest\tBalance");
		double balance = totalPayment;
		double interest = rate;
		double principle = 0;
		for (int payment = 1; payment <= 12 * year; payment++) {
			interest = (rate / 1200) * loan;
			principle = monthlyPayment - interest;
			balance = balance - (principle + interest);
			loan = loan - principle;
			System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", payment, principle, interest, balance);
		}

	}

}
