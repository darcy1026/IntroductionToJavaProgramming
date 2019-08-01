package chapter06.questions;

import java.util.Scanner;

public class Question_35 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a side of the polygon: ");
		double side = input.nextDouble();
		printArea(side);
	}

	public static void printArea(double side) {
		double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
		System.out.println("the area of the pentagon is: " + area);
	}

}
