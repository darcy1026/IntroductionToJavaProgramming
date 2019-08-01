package chapter06.questions;

public class Question_29 {

	public static void main(String[] args) {
		int n = 2;
		while (n < 1000) {
			if (isPrime(n) && isPrime(n + 2)) {
				System.out.println("(" + n + ", " + (n + 2) + ")");
			}
			n++;
		}
	}

	public static boolean isPrime(int num) {
		for (int divisor = 2; divisor < num; divisor++) {
			if (num % divisor == 0) {
				return false;
			}
		}
		return true;
	}

}
