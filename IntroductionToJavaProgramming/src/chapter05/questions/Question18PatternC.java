package chapter05.questions;

public class Question18PatternC {

	public static void main(String[] args) {
		System.out.println("Patter C");
		
		int n = 6;
		int k = 2 * n - 2;
		
		for (int i = 1; i < n + 1; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}
			k -= 2;
			for (int l = i; l > 0; l--) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}

}
