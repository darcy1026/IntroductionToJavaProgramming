package chapter_08_questions;

import java.util.Scanner;

public class Question_08_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size for the matrix: ");
		int size = input.nextInt();
		int[][] array = getMatrix(size);
		print(array);
		isZeroRow(array);
		isOneRow(array);

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

	}

	public static void isZeroRow(int[][] array) {
		int allZeroRow = checkRowZeros(array);
		if (allZeroRow != -1) {
			System.out.println("All 0s on row " + (allZeroRow + 1));
		} else {
			System.out.println("No all zeros on a row");
		}
	}

	public static int checkRowZeros(int[][] m) {
		int zerosRow = -1;
		boolean check = true;
		for (int rows = 0; rows < m.length; rows++) {
			for (int columns = 0; columns < m.length; columns++) {
				if (m[rows][columns] == 0) {
					continue;
				}else {
					check = false;
				}
			}
			
			if (true) {
				zerosRow = rows;
			}
		}
		return zerosRow;
	}

	public static void isOneRow(int[][] array) {
		int allOneRow = checkRowForOne(array);
		if (allOneRow != -1) {
			System.out.println("All 1s on row " + allOneRow);
		} else {
			System.out.println("No all ones on a row");
		}

	}

	public static int checkRowForOne(int[][] m) {
		int onesRow = -1;
		boolean check = true;
		for (int rows = 0; rows < m.length; rows++) {
			for (int columns = 0; columns < m.length; columns++) {
				if (m[rows][columns] == 0) {
					check = false;
					break;
				}
			}
			if (true) {
				onesRow = rows;
			}
		}
		return onesRow;
	}
}
