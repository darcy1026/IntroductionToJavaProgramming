package chapter05.questions;

public class Question07 {
	public static void main(String[] args) {
		/*
		 * (Financial application: compute future tuition) Suppose that the tuition for
		 * a university is $10,000 this year and increases 5% every year. In one year,
		 * the tuition will be $10,500. Write a program that computes the tuition in ten
		 * years and the total cost of four years’ worth of tuition after the tenth
		 * year.
		 */

		double tuition = 10_000;
		double totalCost = 0;
		for (int i = 1; i < 11; i++) {
			tuition *= 1.05;
			System.out.printf("Tuition will be %.2f after %d years.\n", tuition, i);
			totalCost += tuition;
		}
		
		System.out.printf("\nTotal cost after 10 years is %.2f", totalCost);
		System.out.println();
		
		for (int j = 14; j < 40; j += 4) {
			tuition *= Math.pow(1.05, 4);
			System.out.printf("\nAfter %d years tuition will be %.2f", j, tuition);
		}
	}

}
