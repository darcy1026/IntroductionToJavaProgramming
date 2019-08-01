package chapter_07_questions;

import java.util.Scanner;

public class Question_07_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] number = new int[10];
		System.out.print("Enter ten int: ");

		int num;
		int count = 0;
		for (int i = 0; i < number.length; i++) {
			num = input.nextInt();
			if (isDistinct(number, num)) {
				number[count] = num;
				count++;
			} 
			
		}
		System.out.println("The number of distinct numbers are " + count);
		print(number);

	}

	public static void print(int[] number) {
		System.out.print("The distinct numbers are: ");
		for (int i = 0; i < number.length; i++) {
			if(number[i] > 0)
			System.out.print(number[i] + " ");
		}
		
	}

	public static boolean isDistinct(int[] number, int num) {

		for (int i = 0; i < number.length; i++) {
			if (num == number[i])
				return false;
		}
		return true;
	}

}
