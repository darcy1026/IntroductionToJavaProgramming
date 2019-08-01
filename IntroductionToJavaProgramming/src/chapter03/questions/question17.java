package chapter03.questions;

import java.util.Scanner;

public class question17 {

	public static void main(String[] args) {
		/*
		 * (Game: scissor, rock, paper) Write a program that plays the popular
		 * scissor-rockpaper game. (A scissor can cut a paper, a rock can knock a
		 * scissor, and a paper can wrap a rock.) The program randomly generates a
		 * number 0, 1, or 2 representing scissor, rock, and paper. The program prompts
		 * the user to enter a number 0, 1, or 2 and displays a message indicating
		 * whether the user or the computer wins, loses, or draws. Here are sample runs:
		 */

		Scanner input = new Scanner(System.in);

		int computer = (int) (Math.random() * 3);

		System.out.println("Pick one: (0) rock, (1) scissor, (2) paper");
		int user = input.nextInt();

		System.out.println(computer);
		
		switch (user) {

		case 0:
			System.out.println("You are rock");
			break;
		case 1:
			System.out.println("You are scissor");
			break;
		case 2:
			System.out.println("You are paper");

		}

		switch (computer) {

		case 0:
			System.out.println("Computer is rock");
			break;
		case 1:
			System.out.println("Computer is scissor");
			break;
		case 2:
			System.out.println("Computer is paper");

		}

		// System.out.println("You are " + user + " computer is " + computer);

		if (user == 0 && computer == 1 || user == 1 && computer == 2 || user == 2 && computer == 0) {
			System.out.println("You won.");
		} else if (user == 0 && computer == 0 || user == 1 && computer == 1 || user == 2 && computer == 2) {
			System.out.println("Tie");
		} else {
			System.out.println("Computer won.");
		}

	}

}
