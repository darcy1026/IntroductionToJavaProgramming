package chapter_07_questions;

import java.util.Scanner;

public class Question_07_08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] number = new double[10];

		System.out.println("Enter ten double values: ");
		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextDouble();
		}

		System.out.println("The average value is: " + average(number));

	}

	public static double average(double[] number) {
		double average = 0;
		for (int i = 0; i < number.length; i++) {
			average += number[i];
		}
		return average / number.length;
	}

	public static int average(int[] number) {
		int average = 0;
		for (int i = 0; i < number.length; i++) {
			average += number[i];
		}
		return average / number.length;
	}

}
