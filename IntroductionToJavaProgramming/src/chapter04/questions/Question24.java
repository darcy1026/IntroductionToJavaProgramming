package chapter04.questions;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		/*
		 * (Order three cities) Write a program that prompts the user to enter three
		 * cities and displays them in ascending order. Here is a sample run:
		 */
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the first city: ");
		String city1 = input.nextLine();
		System.out.println("Enter the second city: ");
		String city2 = input.nextLine();
		System.out.println("Enter the third city: ");
		String city3 = input.nextLine();

		if (city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0 && city2.compareTo(city3) < 0) {
			System.out.println("The cities in alphabetical order are " + city1 + " " + city2 + " " + city3);
		}
		else if (city1.compareTo(city2) < 0 && city1.compareTo(city3) < 0 && city3.compareTo(city2) < 0) {
			System.out.println("The cities in alphabetical order are " + city1 + " " + city3 + " " + city2);
		} 
		else if (city2.compareTo(city1) < 0 && city2.compareTo(city3) < 0 && city1.compareTo(city3) < 0) {
			System.out.println("The cities in alphabetical order are " + city2 + " " + city1 + " " + city3);
		} 
		else if (city2.compareTo(city1) < 0 && city2.compareTo(city3) < 0 && city3.compareTo(city1) < 0) {
			System.out.println("The cities in alphabetical order are " + city2 + " " + city3 + " " + city1);
		}
		else if (city3.compareTo(city2) < 0 && city3.compareTo(city1) < 0 && city2.compareTo(city1) < 0) {
			System.out.println("The cities in alphabetical order are " + city3 + " " + city2 + " " + city1);
		} 
		else if (city3.compareTo(city2) < 0 && city3.compareTo(city1) < 0 && city1.compareTo(city2) < 0) {
			System.out.println("The cities in alphabetical order are " + city3 + " " + city1 + " " + city2);
		} 
	}

}
