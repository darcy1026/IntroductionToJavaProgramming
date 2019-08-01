package chapter02.questions;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		/*
		 * ( Population projection) Rewrite Programming Exercise 1.11 to prompt the user
		 * to enter the number of years and displays the population after the number of
		 * years. Use the hint in Programming Exercise 1.11 for this program. The
		 * population should be cast into an integer. Here is a sample run of the
		 * program:
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Current population is 312,032,486 and one year has 365 days.");
		
		System.out.println("If you wonder what would be the population after x years. Enter an x value: ");
		int years = input.nextInt();
		
		int currentPopulation = 312032486;
		final int YEAR_TO_SECOND = 365 * 24 * 60 * 60;
		int birth = YEAR_TO_SECOND / 7;
		int death = YEAR_TO_SECOND / 13;
		int immigrant = YEAR_TO_SECOND / 45;
		System.out.println("After " + years + " years later the population will be "
				+ (((birth - death) + immigrant) * years + currentPopulation));

	}

}
