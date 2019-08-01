package chapter03.questions;

import java.util.Scanner;

public class question01 {

	public static void main(String[] args) {
		/*
		 * (Algebra: solve quadratic equations) The two roots of a quadratic equation
		 * ax2 + bx + c = 0 can be obtained using the following formula: r1 = -b + 2b2 -
		 * 4ac 2a and r2 = -b - 2b2 - 4ac 2a b2 - 4ac is called the discriminant of the
		 * quadratic equation. If it is positive, the equation has two real roots. If it
		 * is zero, the equation has one root. If it is negative, the equation has no
		 * real roots. Write a program that prompts the user to enter values for a, b,
		 * and c and displays the result based on the discriminant. If the discriminant
		 * is positive, display two roots. If the discriminant is 0, display one root.
		 * Otherwise, display “The equation has no real roots”. Note that you can use
		 * Math.pow(x, 0.5) to compute 2x. Here are some sample runs.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("enter the values for a, b, c.(ax^2 + bx + c = 0)");
		double valueA = input.nextDouble();
		double valueB = input.nextDouble();
		double valueC = input.nextDouble();

		final double ROOT1 = (-valueB + Math.pow((valueB * valueB) - 4 * valueA * valueC, 0.5)) / 2 * valueA;
		final double ROOT2 = (-valueB - Math.pow((valueB * valueB) - 4 * valueA * valueC, 0.5)) / 2 * valueA;
		final double DISCRIMINANT = Math.pow((valueB * valueB) - 4 * valueA * valueC, 0.5) / (2 * valueA);
		
		if (DISCRIMINANT > 0) {
			System.out.println("The equations has two roots " + ROOT1 + " and " + ROOT2);
		} else if (DISCRIMINANT == 0) {
			System.out.println("The equations has one root " + ROOT1);
		} else {
			System.out.println("The equation has no real roots.");
		}

	}
}
