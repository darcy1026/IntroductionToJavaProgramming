package chapter_09_questions;

public class Random {

	public static void main(String[] args) {
		java.util.Random random1 = new java.util.Random(1000);

		for (int i = 0; i < 50; i++) {
			System.out.print(random1.nextInt(1000) + " ");
			if ((i + 1) % 10 == 0) {
				System.out.println();
				
			}
		}

		System.out.println("===============");

		java.util.Random random2 = new java.util.Random(1000);

		for (int i = 0; i < 50; i++) {
			System.out.print(random2.nextInt(100) + " ");
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}

	}
}
