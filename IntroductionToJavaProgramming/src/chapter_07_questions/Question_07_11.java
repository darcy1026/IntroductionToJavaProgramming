package chapter_07_questions;

import java.util.Scanner;

public class Question_07_11 {

	public static void main(String[] args) {
		double[] number = new double[10];
		System.out.println("Enter ten numbers: ");
		getNumbers(number);
		System.out.printf("The mean is: %.2f", mean(number));
		System.out.println();
		System.out.printf("The deviation is: %.5f", deviation(number));
	}

	public static double deviation(double[] number) {
		double sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum += Math.pow(number[i] - mean(number), 2);
		}
		double deviation = Math.sqrt(sum / (number.length - 1));
		return deviation;
	}

	public static double mean(double[] number) {
		double sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum += number[i];
		}
		double mean = sum / number.length;
		return mean;
	}

	public static void getNumbers(double[] number) {
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextDouble();
		}
	}

}
