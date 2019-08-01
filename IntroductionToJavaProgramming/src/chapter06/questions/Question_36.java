package chapter06.questions;

import java.util.Scanner;

public class Question_36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of the sides: ");
		double numberOfSides = input.nextDouble();
		
		System.out.print("Enter the lenght of the one side: ");
		double lenghtOfSide = input.nextDouble();
		
		printArea(numberOfSides, lenghtOfSide);
	}

	public static void printArea(double numberOfSides, double lenghtOfSide) {
		double area = (numberOfSides * Math.pow(lenghtOfSide, 2)) / (4 * Math.tan(Math.PI / numberOfSides));
		System.out.println(area);
	}
	

}
