package chapter_07_questions;

import java.util.Scanner;

public class Question_07_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of balls to drop: ");
		int numberOfBalls = input.nextInt();

		random();
		String[] arrayForEachBall = new String[7];
		printArray(arrayForEachBall, numberOfBalls);
	}

	public static void printArray(String[] arrayForEachBall, int numberOfBalls) {
		int numberOfSlots = 8;
		char[] slot = new char[numberOfSlots];
		for (int j = 0, num = 0; j < numberOfBalls; j++, num++) {
			int numberOfLeft = 0;
			int numberOfRight = 0;
			for (int i = 0; i < arrayForEachBall.length; i++) {
				if (random() == 0) {
					arrayForEachBall[i] = "L";
					System.out.print(arrayForEachBall[i]);
					numberOfLeft++;
				} else {
					arrayForEachBall[i] = "R";
					System.out.print(arrayForEachBall[i]);
					numberOfRight++;
				}
			}
			getTheDigitOfTheSlot(slot, numberOfRight);
			
			System.out.println();
		}
		printSlot(slot, numberOfBalls);

	}

	public static void printSlot(char[] slot, int numberOfBalls) {
		System.out.println();
		System.out.print(slot);

	}

	public static char[] getTheDigitOfTheSlot(char[] slot, int numberOfRight) {
		switch (numberOfRight) {
		case 0:
			slot[0] = 'O';
			break;
		case 1:
			slot[1] = 'O';
			break;
		case 2:
			slot[2] = 'O';
			break;
		case 3:
			slot[3] = 'O';
			break;
		case 4:
			slot[4] = 'O';
			break;
		case 5:
			slot[5] = 'O';
			break;
		case 6:
			slot[6] = 'O';
			break;
		case 7:
			slot[7] = 'O';
			break;
		}
		return slot;
	}

	public static int random() {
		return (int) (Math.random() * 2);
	}
}
