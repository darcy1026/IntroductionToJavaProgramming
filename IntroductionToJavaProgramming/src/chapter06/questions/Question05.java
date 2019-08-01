package chapter06.questions;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three number: ");
		
		double n1 = input.nextDouble();
		double n2 = input.nextDouble();
		double n3 = input.nextDouble();
		
		System.out.println("The sorted orders of the numbers are: ");
		displaySortedNumbers(n1, n2, n3);
	}

	public static void displaySortedNumbers(double n1, double n2, double n3) {
		if (n2 <= n1 && n3 <= n1) {
			if(n2 <= n3) {
				System.out.println(n3 + " < " + n2 + " < " + n1);
			}else {
				System.out.println(n2 + " < " + n3 + " < " + n1);
			}
		}else if (n1 <= n3 && n2 <= n3) {
			if(n2 <= n1) {
				System.out.println(n2 + " < " + n1 + " < " + n3);
			}else {
				System.out.println(n1 + " < " + n2 + " < " + n3);
			}
		}else {
			if(n3 <= n1) {
				System.out.println(n3 + " < " + n1 + " < " + n2);
			}else {
				System.out.println(n1 + " < " + n3 + " < " + n2);
			}
		}
	}
}
