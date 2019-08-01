package chapter05.questions;

public class Question18PatternD {

	public static void main(String[] args) {
		System.out.println("Pattern D");

		int n = 6;
		
		for (int i = 1; i < n + 2; i++) {
			for (int j = i - 1; j > 0; j--) {
				System.out.print("  ");
			}

			for (int j = 1; j < n + 2 - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
