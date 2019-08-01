package chapter04.questions;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		// AREA OF THE REGULAR POLYGON
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of the sides: ");
		
		double number = input.nextDouble();
		
		System.out.print("Enter the side: ");
		
		double side = input.nextDouble();
		
		double area = (number * side * side) / (4 * Math.tan(Math.PI / number));
		
		area = (int)(area * 100) / 100.0;
				
		System.out.println("The area of the polygon is " + area);
		
		
	}

}
