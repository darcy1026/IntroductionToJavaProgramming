package chapter_08_questions;

public class Question_08_10 {

	public static void main(String[] args) {
		int[][] matrix = getMatrix();
		print(matrix);
		findLargestRow(matrix);
		findLargestColumn(matrix);
	}

	public static int[][] getMatrix() {
		int[][] m = new int[4][4];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * 2);
			}
		}
		return m;
	}

	public static void print(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
	}

	public static void findLargestRow(int[][] m) {
		int largestRow = 0;
		int largestRowIndex = 0;
		for (int i = 0; i < m.length; i++) {
			largestRow += m[0][i];
		}

		for (int i = 1; i < m.length; i++) {
			int checkRow = 0;
			for (int j = 0; j < m[i].length; j++) {
				checkRow += m[i][j];
			}
			if (largestRow < checkRow) {
				largestRow = checkRow;
				largestRowIndex = i;
			}
		}

		System.out.println("The largest row index: " + (largestRowIndex + 1));
	}

	public static void findLargestColumn(int[][] m) {
		int largestColumn = 0;
		int largestColIndex = 0;
		for (int column = 0; column < m.length; column++) {
			largestColIndex += m[column][0];
		}

		for (int column = 1; column < m.length; column++) {
			int checkSumCol = 0;
			for (int row = 0; row < m.length; row++) {
				checkSumCol += m[row][column];
			}

			if (checkSumCol > largestColumn) {
				largestColumn = checkSumCol;
				largestColIndex = column;
			}
		}
		System.out.println("The largest column index is: " + (largestColIndex + 1));
	}
}
