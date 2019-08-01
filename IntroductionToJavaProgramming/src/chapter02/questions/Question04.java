package chapter02.questions;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		/*
		 * ( Convert pounds into kilograms) Write a program that converts pounds into
		 * kilograms. The program prompts the user to enter a number in pounds, converts
		 * it to kilograms, and displays the result. One pound is 0.454 kilograms.
		 */
		Scanner input = new Scanner(System.in);
		final double POUND_TO_KG = 0.454;
		
		System.out.println("Enter a number in pounds: ");
		
		double pound = input.nextDouble();
		
		double kg = pound * POUND_TO_KG;
		
		System.out.println(pound + " in pounds is equal " + kg + " in kilograms.");
		
		
		
	}

}
