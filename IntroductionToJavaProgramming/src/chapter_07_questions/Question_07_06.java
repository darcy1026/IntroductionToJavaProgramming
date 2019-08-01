package chapter_07_questions;

public class Question_07_06 {

	public static void main(String[] args) {
		int[] primeArray = new int[50];
		int count = 0;
		for (int prime = 2; prime < 10_000; prime++) {
			boolean isPrime = true;

			for (int divisor = 2; divisor < prime; divisor++) {
				if (prime % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeArray[count] = prime;
				count++;
			}
			if (count == 50) {
				break;
			}
		}
		printArray(primeArray);

	}

	public static void printArray(int[] primeArray) {
		for (int i = 0; i < primeArray.length; i++) {
			if (primeArray[i] > 0)
				System.out.printf("%-4d ", primeArray[i]);
			if ((i + 1) % 10 == 0)
				System.out.println();
		}
	}

}
