package chapter05.questions;

public class Question13 {

	public static void main(String[] args) {
		/*
		 * (Find the largest n such that n3 6 12,000) Use a while loop to find the
		 * largest integer n such that n3 is less than 12,000.
		 */

		int n = 0;
		while (n * n * n < 12_000) {
			if (n * n * n < 12_000)
				n++;
			else
				break;
		}
		System.out.println("The largest n that is less than 12_000 is: " + (n - 1));
	}
}
