package chapter05.questions;

public class Question20SA {

	public static void main(String[] args) {
		/*
		 * (Display prime numbers between 2 and 1,000) Modify Listing 5.15 to display
		 * all the prime numbers between 2 and 1,000, inclusive. Display eight prime
		 * numbers per line. Numbers are separated by exactly one space.
		 */
		int numberPerLine = 8;
		int count = 0;
		for (int number = 2; number < 1000; number++) {// number is prime number
			boolean isPrime = true;
			for (int divisor = 2; divisor < number; divisor++) {
				if (number % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
				if(count % numberPerLine == 0) {
					System.out.println(number);
				}else {
					System.out.printf("%-4d", number);
				}
			}
		}
	}
}
