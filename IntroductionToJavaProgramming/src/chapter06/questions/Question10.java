package chapter06.questions;

public class Question10 {

	public static void main(String[] args) {
		int number = 10_000;
		System.out.println("The prime numbers less than 10_000 are: ");
		isPrime(number);
	}
	public static void isPrime(int number) {
		for (int prime = 2; prime < 10_000; prime++) {
			boolean isPrime = true;
			for (int divisor = 2; divisor < prime; divisor++) {
				if(prime % divisor == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(prime);
				
			}
		}
	}

}
