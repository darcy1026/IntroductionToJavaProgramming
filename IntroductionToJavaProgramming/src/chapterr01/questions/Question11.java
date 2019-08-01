package chapterr01.questions;

public class Question11 {

	public static void main(String[] args) {
		/*
		 * ( Population projection) The U.S. Census Bureau projects population based on
		 * the following assumptions: ■ One birth every 7 seconds ■ One death every 13
		 * seconds ■ One new immigrant every 45 seconds Write a program to display the
		 * population for each of the next five years. Assume the current population is
		 * 312,032,486 and one year has 365 days. Hint: In Java, if two integers perform
		 * division, the result is an integer. The fractional part is truncated. For
		 * example, 5 / 4 is 1 (not 1.25 ) and 10 / 4 is 2 (not 2.5 ). To get an
		 * accurate result with the fractional part, one of the values involved in the
		 * division must be a number with a decimal point. For example, 5.0 / 4 is 1.25
		 * and 10 / 4.0 is 2.5 .
		 * 
		 */
		System.out.println("Current population is 312,032,486 and one year has 365 days.");
		int currentPopulation = 312032486;
		final int YEAR_TO_SECOND = 365 * 24 * 60 * 60;
		int birth = YEAR_TO_SECOND / 7;
		int death = YEAR_TO_SECOND / 13;
		int immigrant = YEAR_TO_SECOND / 45;
		System.out.println("After 5 years later the population will be "
				+ (((birth - death) + immigrant) * 5 + currentPopulation));
		// System.out.println(((birth - death) + immigrant) * 5 + currentPopulation);
		// System.out.println(YEAR_TO_SECOND);
	}

}
