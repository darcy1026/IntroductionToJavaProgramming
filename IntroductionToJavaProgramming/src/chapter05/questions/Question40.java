package chapter05.questions;

public class Question40 {

	public static void main(String[] args) {
		/*
		 * (Simulation: heads or tails) Write a program that simulates flipping a coin
		 * one million times and displays the number of heads and tails.
		 */
		int head = 0;
		int tail = 0;
		for (int i = 0; i < 1_000_000; i++) {
			int coin = (int) (Math.random() * 2);
			if (coin == 0) {
				System.out.println("head");
				head++;
			} else {
				System.out.println("tail");
				tail++;
			}
		}
		System.out.println("head: " + head + "\ntail: " + tail);

	}

}
