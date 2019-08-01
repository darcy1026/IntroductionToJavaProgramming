package chapter06.questions;

public class Question27_AGAIN {

	public static void main(String[] args) {
		int numberOfEmirps = 100;
		int numberPerLine = 10;
		int count = 0;
		int n = 2;
		
		while(count < 100) {
			if(isEmirpPrime(n)) {
				count++;
				System.out.print(count % 10 == 0 ? n + "\n" : n + " ");
			}
			n++;
		}
	}

	public static boolean isEmirpPrime(int num) {
		return isPrime(num) && !isPalindrome(num) && isPrime(reverse(num));
	}

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor < number; divisor++) {
			if(number % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPalindrome(int number) {
		
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
