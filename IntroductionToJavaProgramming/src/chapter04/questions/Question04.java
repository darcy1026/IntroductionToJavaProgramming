package chapter04.questions;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		//AREA OF THE HEXAGON
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the side of the hexagon: ");
		double side = input.nextDouble();
		
		double area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));
		
		area = (int)(area * 100) / 100.0;
		
		System.out.println("The area of the Hexagon is " + area);
		
		
		
		
		
	}

}
