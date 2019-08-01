package chapter_08_questions;

import java.util.Scanner;

public class Question_08_14_02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size for the matrix: ");
		int size = input.nextInt();
		int[][] array = getMatrix(size); // from math random
		print(array);
		checkAndPrintZerosForRows(array, size);
		checkAndPrintOnesForRows(array, size);
		checkAndPrintZerosForColumns(array, size);
		checkAndPrintOnesForColumns(array, size);
		checkAndPrintZerosForMajorDioganal(array, size);
		checkAndPrintOnesForMajorDioganal(array, size);
		checkAndPrintZerosForSubDioganal(array, size);
		checkAndPrintOnesForSubDioganal(array, size);

	}

	public static int[][] getMatrix(int size) {
		int[][] m = new int[size][size];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				m[i][j] = (int) (Math.random() * 2);
			}
		}
		return m;
	}

	public static void print(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("=============");

	}

	public static void checkAndPrintZerosForRows(int[][] m, int num) {
		int resultZero = -1;
		for (int row = 0; row < m.length; row++) {
			int count = 0;
			for (int column = 0; column < m.length; column++) {
				if (m[row][column] == 0)
					count++;
			}
			if (count == num) {
				resultZero = row;
			}
		}

		if (resultZero != -1) {
			System.out.println("All 0s on row " + resultZero + ".");
		} else {
			System.out.println("The is no all 0s row.");
		}

	}

	public static void checkAndPrintOnesForRows(int[][] m, int num) {
		int resultOne = -1;
		for (int row = 0; row < m.length; row++) {
			int count = 0;
			for (int column = 0; column < m.length; column++) {
				if (m[row][column] == 1)
					count++;
			}
			if (count == num) {
				resultOne = row;
			}
		}

		if (resultOne != -1) {
			System.out.println("All 1s on row " + resultOne + ".");
		} else {
			System.out.println("The is no all 1s row.");
		}
	}

	public static void checkAndPrintZerosForColumns(int[][] m, int num) {
		int resultZero = -1;
		for (int col = 0; col < m.length; col++) {
			int count = 0;
			for (int row = 0; row < m.length; row++) {
				if (m[row][col] == 0)
					count++;
			}
			if (count == num) {
				resultZero = col;
			}
		}

		if (resultZero != -1) {
			System.out.println("All 0s on column " + resultZero + ".");
		} else {
			System.out.println("The is no all 0s column.");
		}
	}

	public static void checkAndPrintOnesForColumns(int[][] m, int num) {
		int resultOne = -1;
		for (int col = 0; col < m.length; col++) {
			int count = 0;
			for (int row = 0; row < m.length; row++) {
				if (m[row][col] == 1)
					count++;
			}
			if (count == num) {
				resultOne = col;
			}
		}

		if (resultOne != -1) {
			System.out.println("All 1s on column " + resultOne + ".");
		} else {
			System.out.println("The is no all 1s column.");
		}
	}

	public static void checkAndPrintZerosForMajorDioganal(int[][] m, int num) {
		int resultZero = -1;
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i][i] == 0) {
				count++;
			}
			if (count == num) {
				resultZero = i;
			}
		}

		if (resultZero != -1) {
			System.out.println("All 0s on major diagonal ");
		} else {
			System.out.println("The is no all 0s on major diagonal.");
		}
	}

	public static void checkAndPrintOnesForMajorDioganal(int[][] m, int num) {
		int resultOne = -1;
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i][i] == 1) {
				count++;
			}
			if (count == num) {
				resultOne = i;
			}
		}

		if (resultOne != -1) {
			System.out.println("All 1s on major diagonal ");
		} else {
			System.out.println("The is no all 1s on major diagonal.");
		}
	}

	public static void checkAndPrintZerosForSubDioganal(int[][] m, int num) {
		int resultZero = -1;
		int count = 0;
		for (int i = m.length - 1, row = 0; i >= 0; i--, row++) {
			if (m[row][i] == 0) {
				count++;
			}
			if (count == num) {
				resultZero = i;
			}
		}

		if (resultZero != -1) {
			System.out.println("All 0s on sub diagonal ");
		} else {
			System.out.println("The is no all 0s on sub diagonal.");
		}

	}

	public static void checkAndPrintOnesForSubDioganal(int[][] m, int num) {
		int resultOne = -1;
		int count = 0;
		for (int i = m.length - 1, row = 0; i >= 0; i--, row++) {

			if (m[row][i] == 1) {
				count++;
			}
			if (count == num) {
				resultOne = i;
			}
		}

		if (resultOne != -1) {
			System.out.println("All 1s on sub diagonal ");
		} else {
			System.out.println("The is no all 1s on sub diagonal.");
		}

	}
}
