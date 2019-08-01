package chapter05.questions;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		/*
		 * (Find the factors of an integer) Write a program that reads an integer and
		 * displays all its smallest factrs in increasing order. For example, if the
		 * input integer is 120, the output should be as follows: 2, 2, 2, 3, 5.
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		int prime = 2;
		// while (number / prime != 1) {

		while(number / prime != 1) {
			if (number % prime == 0) {
				System.out.println(prime + ", ");
				number = number / prime;
			} else {
				prime++;
			}
		}
		System.out.println(number + ".");
	}
}
