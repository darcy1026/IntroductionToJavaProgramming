package chapter05.questions;

import java.util.Scanner;

public class Question34 {

	public static void main(String[] args) {
		/*
		 * (Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that
		 * plays the scissor-rock-paper game. Revise the program to let the user
		 * continuously play until either the user or the computer wins more than two
		 * times than its opponent.
		 */
		Scanner input = new Scanner(System.in);
		// computer's pick
		int computer = (int)(Math.random() * 10) % 3;
		// guest's pick
		System.out.println("(0) for rock; (1) for scissor; (2) for paper.");
		int guest = input.nextInt();
		
		int computerWin = 0;
		int guestWin = 0;
		for (int i = 0; i < 100; i++) {
			if (computer == guest) {
				System.out.println("computer picks" + computer);
				System.out.println("it is a draw. try again!");
				computer = (int)(Math.random() * 10) % 3;
				guest = input.nextInt();
			}
			else if ((computer == 0 && guest == 1) ||
					(computer == 1 && guest == 2) ||
					(computer == 2 && guest == 0)) {
				System.out.println("computer picks" + computer);
				System.out.println("computer wins. pick a number again.");
				computerWin++;
				computer = (int)(Math.random() * 10) % 3;
				guest = input.nextInt();
			}else {
				System.out.println("computer picks" + computer);
				System.out.println("guest wins. pick a number again.");
				guestWin++;
				computer = (int)(Math.random() * 10) % 3;
				guest = input.nextInt();
			}
			if (computerWin > 2) {
				System.out.println("Computer is winner. Thanks for playing.\nYou are " + guestWin + " computer is " + computerWin);
				break;
			}else if (guestWin > 2) {
				System.out.println("Guest is winner. Thanks for playing.\nYou are " + guestWin + " computer is " + computerWin);
				break;
			}
		}
		
	}

}
