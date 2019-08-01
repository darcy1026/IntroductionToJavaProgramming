package chapter04.questions;

import java.util.Scanner;

public class Question25 {

	public static void main(String[] args) {
		/*
		 * (Generate vehicle plate numbers) Assume a vehicle plate number consists of
		 * three uppercase letters followed by four digits. Write a program to generate
		 * a plate number.
		 */
		Scanner input = new Scanner(System.in);
		
		double d1 = 65 + (int)(Math.random() * (90 - 65));
		char ch1 = (char)d1;
		
		double d2 = 65 + (int)(Math.random() * (90 - 65));
		char ch2 = (char)d2;
		
		double d3 = 65 + (int)(Math.random() * (90 - 65));
		char ch3 = (char)d3;
		
		int n1 = (int)(Math.random() * 10);
		int n2 = (int)(Math.random() * 10);
		int n3 = (int)(Math.random() * 10);		
		
		System.out.printf("%c%c%c%c%d%d%d", ch1, ch2, ch3, '-', n1, n2, n3);
	}

}
