package chapter02.questions;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		final double p = 3.14159;
		System.out.print("Enter the radius and lenght of a cyclinder: ");
		
		Double radius = input.nextDouble();
		Double lenght = input.nextDouble();
		
		double area = radius * radius * p;
		double volume = area * lenght;
		
		System.out.println("The area of your cyclinder is " + area + ".");
		System.out.println("The volume of your cyclinder is " + volume + ".");

	}

}
