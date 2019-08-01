package chapter05.questions;

import java.util.Scanner;

public class Question32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two digit number: ");
		int guess = input.nextInt();

		int d1 = (int) (Math.random() * 10);
		int d2;
		do {
			d2 = (int) (Math.random() * 10);
		} while (d1 == d2);

		int g1 = guess / 10;
		int g2 = guess % 10;
		System.out.println("The lottery number is: " + d1 + d2);
		if ((g1 == d1) && (g2 == d2)) {
			System.out.println("Congraculations. All match. Won $10_000 ");
		} else if ((g1 == d1) || (g2 == d2) || (g1 == d2) || (g2 == d1)) {
			System.out.println("One matchs. Won $1_000");
		} else if ((g1 == d2) && (g2 == d1)) {
			System.out.println("Two matchs in dif. places. Won $3_000");
		} else {
			System.out.println("No match.");
		}

	}
}
