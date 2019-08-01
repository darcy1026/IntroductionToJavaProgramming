package chapter_08_questions;

public class Question_08_03 {

	public static void main(String[] args) {

		char[][] answers = { 
				{ 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' }};

		char[] key = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };

		//student's number and correct answers
		int[][] numberOfCorrects = new int[answers.length][2];// [i][0] == student number // [i][1] == correct number
		
		//grade all answers
		for (int i = 0; i < answers.length; i++) {
			// grade one student
			for (int j = 0; j < answers[i].length; j++) {
				if (answers[i][j] == key[j]) {
					numberOfCorrects[i][0] = i;
					numberOfCorrects[i][1]++;
				}
			}

		}
		// sort increasing order 
		sort(numberOfCorrects);
		
		// display sorted matrix
		print(numberOfCorrects);
	}

	public static void sort(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			int minCol1 = m[i][1];
			int minCol0 = m[i][0];
			int minIndex = i;
			for (int j = i + 1; j < m.length; j++) {
				if (minCol1 > m[j][1]) {
					minCol1 = m[j][1];
					minCol0 = m[j][0];
					minIndex = j;
				}
			}
			if(minIndex != i) {
				m[minIndex][1] = m[i][1];
				m[minIndex][0] = m[i][0];
				m[i][1] = minCol1;
				m[i][0] = minCol0;
			}
		}
	}
	
	private static void print(int[][] numberOfCorrects) {
		for (int i = 0; i < numberOfCorrects.length; i++) {
			System.out.println("student " + numberOfCorrects[i][0] + " has " + numberOfCorrects[i][1]);
		}
	}
}
