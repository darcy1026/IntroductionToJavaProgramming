 package chapter05.questions;

public class Question33 {

	public static void main(String[] args) {

		for (int number = 2; number < 10_000; number++) {
			int sum = 0;
			
			for (int divisor = 1; divisor < number; divisor++) {
				if (number % divisor == 0) {
					sum += divisor;
				
				}
			}
			if (sum == number) {
				System.out.println(sum + " is a perfect number.");
			}
			
		}

	}

}
