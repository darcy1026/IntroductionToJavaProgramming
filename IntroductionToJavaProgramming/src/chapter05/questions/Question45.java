package chapter05.questions;

import java.util.Scanner;

public class Question45 {

	public static void main(String[] args) {
		/*
		 * (Statistics: compute mean and standard deviation) In business applications,
		 * you are often asked to compute the mean and standard deviation of data. The
		 * mean is simply the average of the numbers. The standard deviation is a
		 * statistic that tells
		 */
		Scanner input = new Scanner(System.in);
		
		double sum = 0;;
		double sumOfsqrOfNumber = 0;
		double number;
		double count = 0;
		System.out.print("Enter ten numbers: ");
		for (int i = 1; i <= 10; i++) {
		number = input.nextDouble();
		sum += number;
		sumOfsqrOfNumber += Math.pow(number, 2);
		count++;
		}
		
		double mean = sum / count;
		System.out.println("The mean is: " + mean);
		double deviation = Math.sqrt((sumOfsqrOfNumber - (Math.pow(sum, 2)/count)) / (count -1));
		System.out.printf("The deviation is: %.5f", deviation);
	}

}
