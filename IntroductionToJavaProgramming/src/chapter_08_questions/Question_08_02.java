package chapter_08_questions;

import java.util.Scanner;

public class Question_08_02 {

	public static void main(String[] args) {
		System.out.println("Enter 4-by-4 matrix row by row: ");
		double[][] matrix = new double[4][4];
		getMatrix(matrix);
		sumMajorDiagonal(matrix);
	}

	public static void getMatrix(double[][] matrix) {
		Scanner input = new Scanner(System.in);
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix.length; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}
	}

	public static void sumMajorDiagonal(double[][] matrix) {
		double sumDiagonal = 0;
		for (int row = 0, column = row; row < matrix.length; row++, column++) {
			sumDiagonal += matrix[row][column];
		}
		System.out.println("Sum of the elements in the major diagonal is " + sumDiagonal);
	}

}
