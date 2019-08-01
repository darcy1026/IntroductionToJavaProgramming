package chapter_07_questions;

import java.util.Scanner;

public class Question_07_20 {

	public static void main(String[] args) {
		double[] number = new double[10];
		System.out.print("Enter ten double number: ");
		getNumbers(number);
		sortNumbers(number);
		printSortedNumbers(number);
	}

	public static void printSortedNumbers(double[] number) {
		System.out.print("Sorted numbers are: ");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
	}

	public static double[] sortNumbers(double[] number) {
		for (int i = 0; i < number.length; i++) {
			double currentMin = number[i];
			int currentMinIndex = i;
			for (int j = i + 1; j < number.length; j++) {
				if(currentMin > number[j]) {
					currentMin = number[j];
					currentMinIndex = j;
				}
			}
			if(currentMin != number[i]) {
				number[currentMinIndex] = number[i];
				number[i] = currentMin;
			}
		}
		return number;
		
	}

	public static double[] getNumbers(double[] number) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextDouble();
		}
		return number;
	}

}
