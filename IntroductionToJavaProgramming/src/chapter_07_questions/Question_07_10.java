package chapter_07_questions;

import java.util.Scanner;
public class Question_07_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] number = new double[10];
		
		System.out.println("Enter ten numbers: ");
		
		for (int i = 0; i < number.length; i++) {
			number[i] = input.nextDouble();
		}
		System.out.println("Index of min is " + min(number));
	}

	public static int min(double[] number) {
		int indexOfMin = 0;
		double min = number[0];
		for (int i = 0; i < number.length; i++) {
			if(number[i] < min) {
				number[i] = min;
				indexOfMin = i;
			}
		}
		return indexOfMin;
		
	}

}
