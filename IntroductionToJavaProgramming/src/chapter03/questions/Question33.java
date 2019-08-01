package chapter03.questions;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		/*
		 * (Financial: compare costs) Suppose you shop for rice in two different
		 * packages. You would like to write a program to compare the cost. The program
		 * prompts the user to enter the weight and price of the each package and
		 * displays the one with the better price. Here is a sample run:
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the weight and price for package1: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		
		System.out.println("Enter the weight and price for package2: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		double rate1 = weight1 / price1;
		double rate2 = weight2 / price2;
		
		System.out.println((rate1 > rate2) ? "Package 1 has better price" : "Package 2 has better price");
		
	}

}
