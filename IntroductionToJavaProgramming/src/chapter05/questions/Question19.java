package chapter05.questions;

public class Question19 {

	public static void main(String[] args) {
		int n = 11;
		int k = 3 * n - 4;
		for (int i = 1; i < Math.pow(2, n + 2); i *= 2) {
			for (int j = 0; j < k; j++) {
				System.out.print("  ");
			}
			k -= 2;
			for (int l = 1; l < i; l *= 2) {
				System.out.printf("%4d", l);
			}
			for (int r = i; r > 0; r /= 2) {
				System.out.printf("%4d", r);
			}
			
			System.out.println();
			
		}

	}

}
