package chapter05.questions;

public class Question10_01 {

	public static void main(String[] args) {
		/*
		 * (Find numbers divisible by 5 and 6) Write a program that displays all the
		 * numbers from 100 to 1,000, ten per line, that are divisible by 5 and 6.
		 * Numbers are separated by exactly one space.
		 */

		for (int i = 100; i < 400; i++) {
			if ((i % 5 == 0) && (i % 6 == 0)) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
		for (int i = 400; i < 700; i++) {
			if ((i % 5 == 0) && (i % 6 == 0)) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println();
		for (int i = 700; i < 1000; i++) {
			if ((i % 5 == 0) && (i % 6 == 0)) {
				System.out.printf("%d ", i);
			}
		}
	}

}
