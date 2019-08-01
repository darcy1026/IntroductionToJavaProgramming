package chapter06.questions;

public class Question_26_AGAIN {

	public static void main(String[] args) {
		int numberOfPalindromicPrimes = 100;
		int numberPerLine = 10;
		int count = 0;
		int n = 2;
		while (count < numberOfPalindromicPrimes) {
			if(isPalindromicPrime(n)) {
				System.out.print(count % numberPerLine == 0 ? "\n" : n + " ");
				count++;
			}
			n++;
		}
	}
	public static boolean isPalindromicPrime(int num) {
		return isPrime(num) && isPaindrome(num);
	}
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor < number; divisor++) {
			if(number % divisor == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isPaindrome(int number) {
		return number == reverse(number) ? true : false;
	}
	public static int reverse(int number) {
		String reverse = "";
		String n = number + "";
		for (int i = n.length() - 1; 0 <= i; i--) {
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse);
	}

}
