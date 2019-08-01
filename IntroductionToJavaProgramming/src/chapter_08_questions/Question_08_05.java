package chapter_08_questions;

import java.util.Scanner;

public class Question_08_05 {

	public static void main(String[] args) {
		
		System.out.print("Enter matrix1: ");
		double[][] m1 = getMatrix(); 			// THIS IS HOW WE GET AN ARRAY FROM METHOD. 
		
		
		System.out.print("\nEnter matrix2: ");
		double[][] m2 = getMatrix();			// THIS IS HOW WE GET AN ARRAY FROM METHOD.
		
		
		double[][] sum = sumMatrix(m1, m2);
		printMatrix(m1);
		System.out.println("=============");
		printMatrix(m2);
		System.out.println("=============");
		printMatrix(sum);
	}

	public static double[][] getMatrix() {
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = input.nextDouble();
			}
		}
		return matrix;
	}
	
	
	public static double[][] sumMatrix(double[][] m1, double[][] m2) {
		
		double[][] sum = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				sum[i][j] += m1[i][j];
				sum[i][j] += m2[i][j];
			}
		}
		
		return sum;
	}
	
	
	public static void printMatrix(double[][] sum) {
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
			
		}
	}

}
