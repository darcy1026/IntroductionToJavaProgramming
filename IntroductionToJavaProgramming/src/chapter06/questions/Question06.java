package chapter06.questions;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer to display a pattern.");
		int n = input.nextInt();
		
		displayPattern(n);
	}
	public static void displayPattern(int n) {
		for (int i = 1; i < n + 1; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print("  ");
			}
			for (int l = i; l > 0 ; l--) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}

}
