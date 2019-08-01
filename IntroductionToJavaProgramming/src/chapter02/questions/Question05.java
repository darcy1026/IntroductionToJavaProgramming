package chapter02.questions;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		/*
		 * ( Financial application: calculate tips) Write a program that reads the
		 * subtotal and the gratuity rate, then computes the gratuity and total. For
		 * example, if the user enters 10 for subtotal and 15% for gratuity rate, the
		 * program displays $1.5 as gratuity and $11.5 as total.
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the subtotal and gratuity rate: ");
		double subtotal = input.nextDouble();
		double rate = input.nextDouble();

		double finalGratuity = subtotal * (rate / 100);
		double total = finalGratuity + subtotal;

		System.out.println("$" + finalGratuity + " as gratuity and $" + total + " as total.");
	}

}
