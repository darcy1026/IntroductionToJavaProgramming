package chapter06.questions;

public class Question04 {

	public static void main(String[] args) {
		int n = 123456;

		System.out.println("The reverse of the " + n + " is " + reverse(n));
	}

	public static int reverse(int n) {
		String reverse = "";
		String str = n + "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return Integer.parseInt(reverse);
	}
}
