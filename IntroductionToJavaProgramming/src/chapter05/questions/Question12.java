package chapter05.questions;

public class Question12 {

	public static void main(String[] args) {
		/*
		 * Find the smallest n such that n2 7 12,000) Use a while loop to find the
		 * smallest integer n such that n2 is greater than 12,000.
		 */
		int n = 0;
		while (true) {
			if (n * n < 12_000)
				n++;
			else
				break;
		}
		System.out.println("The smallest n is: " + (-1 * (n - 1)));
	}

}
