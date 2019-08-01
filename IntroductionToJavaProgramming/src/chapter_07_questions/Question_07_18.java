package chapter_07_questions;

import java.util.Scanner;

public class Question_07_18 {

	public static void main(String[] args) {
		System.out.println("Enter ten integer: ");
		double[] number = new double[10];
		getNumber(number);
		sortNumber(number);
		printSortedNumber(number);
		
	}

	public static void printSortedNumber(double[] number) {
		
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i] + " ");
		}
	}

	public static double[] sortNumber(double[] number) {
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

	public static double[] getNumber(double[] number) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextDouble();
		}
		return number;
	}

}
