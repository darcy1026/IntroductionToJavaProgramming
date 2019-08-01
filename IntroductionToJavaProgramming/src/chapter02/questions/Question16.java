package chapter02.questions;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		Scanner input = new Scanner(System.in);
		
		double rootOfThree = Math.sqrt(3); // YAY! YENI OGRENDIM!!!!
		
		System.out.print("Enter the lenght of one side of the Hexagon, then I will calculate the area of the Hexagon." +
				"\nEnter a value: ");
		
		double lenghtHexagon = input.nextDouble();
		
		double areaHexagon = ((3 * rootOfThree) / 2) * lenghtHexagon * lenghtHexagon;
		
		System.out.println("The area of the Hexagon with " + lenghtHexagon + " side lenght is: " + areaHexagon);
		
		
	}

}
