package chapter02.questions;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		/*
		 * ( Financial application: monetary units) Rewrite Listing 2.10,
		 * ComputeChange.java, to fix the possible loss of accuracy when converting a
		 * double value to an int value. Enter the input as an integer whose last two
		 * digits represent the cents. For example, the input 1156 represents 11 dollars
		 * and 56 cents.
		 */
		Scanner input = new Scanner(System.in);
		//int cents;
		//final int dollar = 100 * cents;
		long toplamMilisaniye = System.currentTimeMillis();
		System.out.println(toplamMilisaniye);
		System.out.print("How much cents do you have in your pocket? ");
		
		int money = input.nextInt();
		
		int finalDollar = money / 100;
		
		int finalCent = money % 100;
		
		System.out.println("Your money in your pocket is $" + finalDollar + " dollars and " + finalCent + " cents." );
		
		
		
		

	}

}
