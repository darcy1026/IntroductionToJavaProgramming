package chapter_07_questions;

import java.util.Scanner;

public class Question_07_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();

		System.out.println("Enter " + numberOfStudents + " scores: ");

		int[] score = new int[numberOfStudents];

		// get the inputs
		for (int i = 0; i < numberOfStudents; i++) {
			score[i] = input.nextInt();
		}

		// find the best
		int best = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] > best) {
				best = score[i];
			}
		}

		printScores(score, best);

	}

	public static void printScores(int[] score, int best) {
		for (int i = 0; i < score.length; i++) {
			if(score[i] >= best - 10) {
				System.out.println("Student " + i + " score is " + score[i] + " and grade is A");
			}else if(score[i] >= best - 20) {
				System.out.println("Student " + i + " score is " + score[i] + " and grade is B");
			}else if(score[i] >= best - 30) {
				System.out.println("Student " + i + " score is " + score[i] + " and grade is C");
			}else if(score[i] >= best - 40) {
				System.out.println("Student " + i + " score is " + score[i] + " and grade is D");
			}else {
				System.out.println("Grade is F");
			}
		}
		
	}

}
