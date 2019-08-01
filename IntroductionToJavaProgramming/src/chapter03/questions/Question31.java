package chapter03.questions;

import java.util.Scanner;

public class Question31 {

	public static void main(String[] args) {
		/*
		 * (Financials: currency exchange) Write a program that prompts the user to
		 * enter the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt
		 * the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to
		 * convert from Chinese RMB and U.S. dollars. Prompt the user to enter the
		 * amount in U.S. dollars or Chinese RMB to convert it to Chinese RMB or U.S.
		 * dollars, respectively. Here are the sample runs:
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the exchange rate from dollars to RMB: ");
		double rate = input.nextDouble();
		
		System.out.println("Enter 0 to convert dollars or RMB and 1 vice versa: ");
		int zeroOrone = input.nextInt();
		
		System.out.println((zeroOrone == 0) ? "Enter the dollar amount: " : "Enter the RMB amount: ");
		double money = input.nextDouble();
		
		if (zeroOrone == 0) {
			System.out.println("$" + money + " is " + (rate * money) + " yuan.");
		}else {
			System.out.println(money + " yuan is $" + (money / rate)); 
		}
	
	}

}
