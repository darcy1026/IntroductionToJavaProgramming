package chapter05.questions;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 * (Count positive and negative numbers and compute the average of numbers)
		 * Write a program that reads an unspecified number of integers, determines how
		 * many positive and negative values have been read, and computes the total and
		 * average of the input values (not counting zeros). Your program ends with the
		 * input 0. Display the average as a floating-point number. Here is a sample
		 * run:
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter an integer, the input ends if it is 0: ");
		int number = input.nextInt();

		int positive = 0; // count the number of positive numbers
		int negative = 0; // count the number of negative numbers
		int count = 0; // count all numbers

		double total = 0; // accumulate the total

		if (number == 0) {
			System.out.println("You have entered the zero.");
			System.exit(1);
		}

		while (number != 0) {
			if (number > 0)
				positive++;                 // increase positive
			else
				negative++;                 // increase negative
			total += number;                // sum of the total number
			count++;                        // number of the inputs
			number = input.nextInt();       // input for each integer

		}
		double average = total / count;
		System.out.println("number of positives: " + positive + "\ntotal: " + total + "\nnumber of negatives: "
				+ negative + "\nthe average is: " + average);

	}

}
