package chapter_08_questions;

import java.util.Scanner;

public class Question_08_13_I_DID_LIKE_IT {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		System.out.println("Enter the array: ");
		double[][] array = getArray(rows, columns);
		int[] largestPointer = locateLargest(array);

		System.out.println(
				"The location of larget element is at (" + largestPointer[0] + ", " + largestPointer[1] + ") ");

	}

	public static double[][] getArray(int rows, int columns) {
		Scanner input = new Scanner(System.in);
		double[][] m = new double[rows][columns];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextDouble();
			}
		}
		return m;
	}

	public static int[] locateLargest(double[][] array) {
		int[] largestPointer = new int[2];
		double largest = array[0][0];
		for (int row = 0; row < array.length; row++) {
			for (int column = 0; column < array[row].length; column++) {
				if (largest < array[row][column]) {
					largest = array[row][column];
					largestPointer[0] = row;
					largestPointer[1] = column;
				}
			}
		}
		return largestPointer;
	}
}
