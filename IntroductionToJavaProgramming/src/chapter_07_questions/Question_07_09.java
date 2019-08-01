package chapter_07_questions;

import java.util.Scanner;

public class Question_07_09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double[] number = new double[10];
		
		System.out.println("Enter ten numbers");

		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextDouble();
		}

		System.out.println("The min number is: " + min(number));
	}

	public static double min(double[] number) {
		double min = number[0];

		for (int i = 0; i < number.length; i++) {
			if (number[i] < min) {
				min = number[i];
			}
		}

		return min;
	}

}
