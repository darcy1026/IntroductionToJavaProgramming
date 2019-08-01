package chapter04.questions;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// AREA OF THE PENTAGON
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the lenght from the center to a vertex: ");
		
		double r = input.nextDouble();
		
		double side = 2 * r * Math.sin(Math.PI / 5);
		
		double areaOfPentagon = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
		
		areaOfPentagon = (int)(areaOfPentagon * 100) / 100.0;  // DOUBLE ILA BOLMEYI UNUTMA!!!!
		
		System.out.println("The area of the pentagon is " + areaOfPentagon);
		
	}

}
