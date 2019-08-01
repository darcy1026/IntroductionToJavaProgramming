package chapter_08_questions;

import java.util.Scanner;

public class Question_08_01 {

	public static void main(String[] args) {
		
		double[][] matrix = new double[3][4];
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		getMatrix(matrix);
		sumColumn(matrix);
	}

	public static void getMatrix(double[][] matrix) {
		Scanner input = new Scanner(System.in);
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}
	}
	
	public static void sumColumn(double[][] matrix) {
		for (int column = 0; column < matrix.length + 1; column++) {  // BENIM ANLADIGIM, COLUMN SAYISI ROW DAN BIR FAZLA OLDUGU ICIN VE BUNU BENIM BILDIGIM ICIN VE COLUMN DONERKEN
																	  // BIR FAZLA SAYI DAHA DONMESI GEREKTIGINDEN + 1 DEDIM.
			double sum = 0;
			for (int row = 0; row < matrix.length; row++) {
				sum += matrix[row][column];
			}
			System.out.println("Sum of the elements at column " + column + " is " + sum);
		}
	}


}
