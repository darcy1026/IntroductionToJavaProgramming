package chapter_08_questions;

import java.util.Scanner;

public class Question_08_06 {

	public static void main(String[] args) {
		
		double[][] m1 = getMatrix(1);
		double[][] m2 = getMatrix(2);
		double[][] m3 = multiplyMatrix(m1, m2);
		printMatrix(m1, m2, m3);
		
	}

	public static double[][] getMatrix(int i) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter matrix" + i + ": ");
		double[][] m = new double[3][3];
		for (int j = 0; j < m.length; j++) {
			for (int j2 = 0; j2 < m[j].length; j2++) {
				m[j][j2] = input.nextDouble();
			}
		}
		return m;
	}
	
	public static double[][] multiplyMatrix(double[][] m1, double[][] m2) {
		double[][] mult = new double[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mult[i][j] = m1[i][0] * m2[0][j] + m1[i][1] * m2[1][j] + m1[i][2] * m2[2][j];
			}
		}
		return mult;
	}
	
	public static void printMatrix(double[][] m, int n) {
		for (int i = 0; i < m[n].length; i++) {
			System.out.printf("%5.1f ", m[n][i]);
			}
		}
	
	public static void printMatrix(double[][] m1, double[][] m2, double[][] m3) {
		System.out.println("The multiplication of the matrices is");
		for (int i = 0; i < 3; i++) {
			printMatrix(m1, i);
			System.out.print((i==1) ? "   *  " : "      ");
			printMatrix(m2, i);
			System.out.print((i==1) ? "   =  " : "      ");
			printMatrix(m3, i);
			System.out.println();
		}
	}

}
