	package chapter05.questions;

import java.util.Scanner;

public class Question14_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		int n1 = input.nextInt();

		System.out.print("Enter the second integer: ");
		int n2 = input.nextInt();

		int gcd = 1;
		int divisor = 2;
		while (divisor <= n1 && divisor <= n2) {
			if (n1 % divisor == 0 && n2 % divisor == 0)
				gcd = divisor;
				divisor++;
		}
		System.out.println(gcd);
	}

}
