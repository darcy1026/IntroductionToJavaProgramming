package chapter03.questions;

import java.util.Scanner;

public class question08 {

	public static void main(String[] args) {
		/*
		 * (Sort three integers) Write a program that prompts the user to enter three
		 * integers and display the integers in non-decreasing order.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter three integer.(ex: 22 34 85)");

		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		if (num1 >= num2 && num2 >= num3) {
			System.out.println(num3 + "<=" + num2 + "<=" + num1);
		}
		if (num1 >= num3 && num3 >= num2) {
			System.out.println(num2 + "<=" + num3 + "<=" + num1);
		}
		if (num2 >= num3 && num3 >= num1) {
			System.out.println(num1 + "<=" + num3 + "<=" + num2);
		}
		if (num2 >= num1 && num1 >= num3) {
			System.out.println(num3 + "<=" + num1 + "<=" + num2);
		}
		if (num3 >= num2 && num2 >= num1) {
			System.out.println(num1 + "<=" + num2 + "<=" + num3);
		}
		if (num3 >= num1 && num1 >= num2) {
			System.out.println(num2 + "<=" + num1 + "<=" + num3);
		}
	}

}
