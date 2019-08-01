package chapter04.questions;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		/*
		 * (Days of a month) Write a program that prompts the user to enter a year and
		 * the first three letters of a month name (with the first letter in uppercase)
		 * and displays the number of days in the month. Here is a sample run:
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		System.out.print("Enter a month(with the first letter in uppercase): ");
		String month = input.next();
		
		month = month.substring(0, 3);
		
		boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		System.out.print(month + " " + year);
		
		switch (month) {
		case "Jan":System.out.println(" has 31 days.");break;
		case "Feb":System.out.println(" has " + ((leapYear) ? 29 : 28) + " days.");break;
		case "Mar":System.out.println(" has 31 days.");break;
		case "Apr":System.out.println(" has 30 days.");break;
		case "May":System.out.println(" has 31 days.");break;
		case "Jun":System.out.println(" has 30 days.");break;
		case "Jul":System.out.println(" has 31 days.");break;
		case "Aug":System.out.println(" has 31 days.");break;
		case "Sep":System.out.println(" has 30 days.");break;
		case "Oct":System.out.println(" has 31 days.");break;
		case "Nov":System.out.println(" has 30 days.");break;
		case "Dec":System.out.println(" has 31 days.");break;
		default: System.out.println(" is an invalid input.");System.exit(1);
								
		}
	}

}
