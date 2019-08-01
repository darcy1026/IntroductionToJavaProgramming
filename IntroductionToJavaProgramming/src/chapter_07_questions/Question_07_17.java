package chapter_07_questions;

import java.util.Scanner;

public class Question_07_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		System.out.println("Enter the names: ");
		String[] names = new String[numberOfStudents];
		getNames(names);
		
		System.out.println("Enter the scores: ");
		int[] scores = new int[numberOfStudents];
		getScores(scores);
		
		sortAndPrintScores(names, scores);
	}

	public static void sortAndPrintScores(String[] names, int[] scores) {

		for (int i = 0; i < scores.length; i++) {
			int currentMin = scores[i];
			int currentMinAndNameIndex = i;
			String currentName = names[i];
			for (int j = i + 1; j < scores.length; j++) {
				if(currentMin > scores[j]) {
					currentMin = scores[j];
					currentMinAndNameIndex = j;
					currentName = names[j];
				}
			}
			if(currentMin != scores[i]) {
				scores[currentMinAndNameIndex] = scores[i];
				names[currentMinAndNameIndex] = names[i];
				names[i] = currentName;
				scores[i] = currentMin;
			}
		}
		
		printScores(names, scores);
		
	}

	public static void printScores(String[] names, int[] scores) {
		for (int i = scores.length - 1, j = 1; i >= 0 ; i--, j++) {
			System.out.println(j + " " + names[i] + ": " + scores[i]);
		}
	}

	public static int[] getScores(int[] scores) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			scores[i] = input.nextInt();
		}
		return scores;
	}

	public static String[] getNames(String[] names) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < names.length; i++) {
			names[i] = input.nextLine();
		}
		return names;
	}

}
