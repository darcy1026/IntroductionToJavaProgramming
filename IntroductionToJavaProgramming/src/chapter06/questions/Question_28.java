package chapter06.questions;

public class Question_28 {

	public static void main(String[] args) {
		System.out.println("p\t\t2^p -1");
		System.out.println("=====================");
		int n = 2;
		while (n < 32) {
			if (isPrime(n) && isPrime((int)(Math.pow(2, n) - 1))) {
				System.out.println(n + "\t\t" + (int) (Math.pow(2, n) - 1));
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
