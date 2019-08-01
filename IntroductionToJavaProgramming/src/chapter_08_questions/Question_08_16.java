package chapter_08_questions;

public class Question_08_16 {

	public static void main(String[] args) {
		int[][] m = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
		int[] mat = convertToOneDim(m);
		print(mat);
		sort(mat);
		System.out.println("\n==============");
		int[][] sorted = convertToTwo(mat);
		print(sorted);
		
	}

	public static int[] convertToOneDim(int[][] m) {
		int[] matrix = new int[12];
		for (int i = 0, j = 0; i < matrix.length; i++, j++) {
			matrix[i] = m[j][0];
			i++;
			matrix[i] = m[j][1];
		}
		return matrix;
	}
	
	public static void print(int[] mat) {
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i] + ",");
		}
	}
	
	public static int[] sort(int[] mat) {
		int min;
		int minIndex;
		for (int i = 0; i < mat.length; i++) {
			min = mat[i];
			minIndex = i;
			for (int j = i + 1; j < mat.length; j++) {
				if(min > mat[j]) {
					min = mat[j];
					minIndex = j;
				}
			}
			if(minIndex != i) {
				mat[minIndex] = mat[i];
				mat[i] = min;
			}
		}
		return mat;
	}
	
	public static int[][] convertToTwo(int[] mat) {
		int[][] m = new int[6][2];
		int j = 0;
		for (int i = 0; i < m.length; i++) {
			m[i][0] = mat[j];
			j++;
			m[i][1] = mat[j];
			j++;
		}
		return m;
	}
	
	public static void print(int[][] sorted) {
		for (int i = 0; i < sorted.length; i++) {
			System.out.print("{" + sorted[i][0] + ", " + sorted[i][1] + "}");
		}
	}

}
