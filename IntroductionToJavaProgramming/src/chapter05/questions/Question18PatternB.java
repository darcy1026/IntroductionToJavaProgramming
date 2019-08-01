package chapter05.questions;

public class Question18PatternB {

	public static void main(String[] args) {
		System.out.println("Pattern B");

		int n = 6;
		for (int i = (n + 1); i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
