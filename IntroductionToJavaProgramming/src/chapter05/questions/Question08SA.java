package chapter05.questions;

import java.util.Scanner;

public class Question08SA {

	public static void main(String[] args) {
		/*
		 * (Find the highest score) Write a program that prompts the user to enter the
		 * number of students and each student’s name and score, and finally displays
		 * the name of the student with the highest score.
		 */
		Scanner input = new Scanner(System.in);

		int highestScore = 0; // holds the highest score
		String highestScoreName = ""; // holds the student name with the highest score
		
		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		System.out.println("Enter the each student name and the score");
		
		for (int i = 0; i < numberOfStudents; i++) {
			
			System.out.print("Student " + (i+1) + " Name: ");
			String name = input.next();
			
			System.out.print("Score: ");
			int score = input.nextInt();
			
			if(score > highestScore) {
				highestScore = score;
				highestScoreName = name;
			}
			
		}
		
		System.out.println("Student with the highest score: " + highestScore);
	}

}
